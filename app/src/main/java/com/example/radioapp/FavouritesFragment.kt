package com.example.radioapp

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.example.radioapp.cardrecyclerview.*
import kotlinx.android.synthetic.main.activity_main_obsolete.station_name_textView
import kotlin.collections.ArrayList



class FavouritesFragment: Fragment(), CardClickListener {



    private lateinit var v: View
    private lateinit var c: Context
    private lateinit var listOfFavourites: ArrayList<Card>

    private val m = MainActivity()
    private var spe = SharedPreferencesEditor()

    //val mediaPlayer = MediaPlayer()

    private lateinit var autoFitRecyclerView: CardRecyclerView

    private lateinit var dialog: AlertDialog

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        v = inflater.inflate(R.layout.fragment_home, container, false)
        c = v.context

        spe.setupSharedPreferencesEditor(c)

        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        inflateCardList(c)
        autoFitRecyclerView = v.findViewById(R.id.auto_fit_recycler_view)
        autoFitRecyclerView.adapter = RecyclerViewAdapter(listOfFavourites, this)

    }

    override fun onCardClicked(holder: CardViewHolder, position: Int) {
        val playButton = (context as Activity).findViewById<ImageButton>(R.id.play_ImageButton)
        playButton.isEnabled = false
        playButton.setImageResource(R.drawable.radio_pause_icon)
        //Play(RadioPlayer.instance.mediaPlayer).execute(listOfFavourites[position].url)


        val play = Play(RadioPlayer.instance.mediaPlayer)
        play.setupPlay(activity as MainActivity)
        play.execute(listOfFavourites[position].url)

        activity!!.station_name_textView.text = listOfFavourites[position].title
        spe.setCurrentStation(listOfFavourites[position])
    }

    override fun onCardLongClicked(holder: CardViewHolder, position: Int) {
        showAlertDialog(position)
    }

    private fun inflateCardList(c: Context) {
        listOfFavourites = spe.getFavouriteList()

    }

    fun updateFavourites() {
        listOfFavourites = spe.getFavouriteList()
        autoFitRecyclerView.adapter = RecyclerViewAdapter(listOfFavourites, this)
        Toast.makeText(c, getString(R.string.added_to_favourites), Toast.LENGTH_SHORT).show()
    }


    private fun showAlertDialog(position: Int) {
        val builder = AlertDialog.Builder(c, R.style.DialogTheme)
        builder.setTitle(getString(R.string.remove_from_favourites))

        val container = FrameLayout(c)
        val params = FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            250
        )
        container.layoutParams = params
        builder.setView(container)


        builder.setPositiveButton(getString(R.string.remove)) { _, _ ->
            spe.deleteStationFromFavouriteList(listOfFavourites[position])

            listOfFavourites.removeAt(position)
            autoFitRecyclerView.removeViewAt(0)
            autoFitRecyclerView.adapter!!.notifyItemRemoved(position)
            autoFitRecyclerView.adapter!!.notifyItemRangeChanged(position, listOfFavourites.size)
            autoFitRecyclerView.adapter!!.notifyDataSetChanged()

            Toast.makeText(c, getString(R.string.removed_from_favourites), Toast.LENGTH_SHORT).show()
        }
        builder.setNegativeButton(getString(R.string.cancel), null)
        dialog = builder.create()
        dialog.show()
    }

}