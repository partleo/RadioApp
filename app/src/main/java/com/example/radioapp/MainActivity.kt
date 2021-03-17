package com.example.radioapp

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import android.media.audiofx.Visualizer
import android.view.Gravity
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.app.ActivityCompat
import androidx.core.content.PermissionChecker
import androidx.core.view.GravityCompat
import com.example.radioapp.SharedPreferencesEditor.Companion.AUTOMATIC_DISPLAY
import com.example.radioapp.SharedPreferencesEditor.Companion.SHOW_AUDIO_VISUALIZER
import com.example.radioapp.SharedPreferencesEditor.Companion.SHOW_PLAY_BUTTON
import com.example.radioapp.cardrecyclerview.Cards.Companion.listOfStationsEST
import com.example.radioapp.cardrecyclerview.Cards.Companion.listOfStationsFIN
import com.example.radioapp.cardrecyclerview.Cards.Companion.listOfStationsSWE
import com.example.radioapp.cardrecyclerview.Cards.Companion.listOfStationsRUS
import com.example.radioapp.cardrecyclerview.Cards.Companion.listOfStationsUK
import com.example.radioapp.cardrecyclerview.Cards.Companion.listOfStationsUSA
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_obsolete.tab_layout
import kotlinx.android.synthetic.main.activity_main_obsolete.view_pager


class MainActivity : AppCompatActivity(), StationsFragment.UpdateFavourites {

    //http://fmstream.org/index.php?c=FIN&o=T <-- täältä löytyy kanavia
    //https://www.countryflags.com/en/finland-flag-icon.html <-- täältä löytyy lippuja

    private var spe = SharedPreferencesEditor()
    lateinit var visualizer: Visualizer

    private var titles: Array<String> = arrayOf()

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    override fun onDestroy() {
        super.onDestroy()
        visualizer.release()
        RadioPlayer.instance.mediaPlayer.release()
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            SettingsFragment().visualizerChecked(this)
        }
    }

    override fun onFavouriteAdded() {
        val favouritesFragment = supportFragmentManager.findFragmentByTag("f0") as FavouritesFragment?
        favouritesFragment?.updateFavourites()
    }

    private fun init() {
        setupSetting()
        setupViewPager()
        setupNavigationView()
        setupPlayButton()
    }

    private fun setupSetting() {
        spe.setupSharedPreferencesEditor(this)
        if (spe.getStatus(AUTOMATIC_DISPLAY, false)) {
            val currentStation = spe.getCurrentStation()
            if (currentStation.title != "") {
                val play = Play(RadioPlayer.instance.mediaPlayer)
                play.setupPlay(this)
                play.execute(currentStation.url)
                //Play(this, RadioPlayer.instance.mediaPlayer).execute(currentStation.url)
                station_name_textView.text = currentStation.title
            }
        }

        val stationParams = station_name_textView.layoutParams as CoordinatorLayout.LayoutParams
        if (spe.getStatus(SHOW_PLAY_BUTTON, true)) {
            stationParams.gravity = (Gravity.BOTTOM or Gravity.START)
            play_ImageButton.visibility = ImageButton.VISIBLE
        } else {
            stationParams.gravity = (Gravity.BOTTOM or Gravity.CENTER)
            play_ImageButton.visibility = ImageButton.GONE
        }
        if (spe.getStatus(SHOW_AUDIO_VISUALIZER, false)) {
            visualizerView.visibility = View.VISIBLE
        } else {
            visualizerView.visibility = View.GONE
        }
    }

    private fun setupViewPager() {
        titles = arrayOf(getString(R.string.favourites), getString(R.string.channels), getString(R.string.settings))
        view_pager.adapter = ViewPagerFragmentAdapter(this, titles)
        TabLayoutMediator(tab_layout, view_pager) { tab, position -> tab.text = titles[position] }.attach()
    }

    private fun setupNavigationView() {
        val toggle = ActionBarDrawerToggle(this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
        nav_view.itemIconTintList = null
        nav_view.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_finland -> { spe.setCurrentList(listOfStationsFIN) }
                R.id.nav_sweden -> { spe.setCurrentList(listOfStationsSWE) }
                R.id.nav_usa -> { spe.setCurrentList(listOfStationsUSA) }
                R.id.nav_uk -> { spe.setCurrentList(listOfStationsUK) }
                R.id.nav_russia -> { spe.setCurrentList(listOfStationsRUS) }
                R.id.nav_estonia -> { spe.setCurrentList(listOfStationsEST) }
                //R.id.nav_share -> { }
            }
            val favouritesFragment = supportFragmentManager.findFragmentByTag("f1") as StationsFragment?
            favouritesFragment?.inflateStationList()
            drawer_layout.closeDrawer(GravityCompat.START)
            true
        }
    }

    private fun setupPlayButton() {
        play_ImageButton.isEnabled = false
        play_ImageButton.setOnClickListener {

            Play(RadioPlayer.instance.mediaPlayer).pausePlayer(play_ImageButton)
        }
    }

    private fun hasPermissions(c: Context): Boolean {
        return PermissionChecker.checkSelfPermission(c, Manifest.permission.RECORD_AUDIO) == PermissionChecker.PERMISSION_GRANTED
    }

    private fun askPermissions(c: Context) {
        ActivityCompat.requestPermissions(c as Activity, arrayOf(Manifest.permission.RECORD_AUDIO), 1)
    }

    fun checkPermissions(c: Context): Boolean {
        return if (hasPermissions(c)) {
            true
        } else {
            askPermissions(c)
            false
        }
    }



}