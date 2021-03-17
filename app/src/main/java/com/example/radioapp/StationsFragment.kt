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


class StationsFragment: Fragment(), CardClickListener {

    private lateinit var v: View
    private lateinit var c: Context

    private var spe = SharedPreferencesEditor()

    private lateinit var autoFitRecyclerView: CardRecyclerView
    private lateinit var dialog: AlertDialog

    private lateinit var updateFavourites: UpdateFavourites

    private lateinit var listOfStations: ArrayList<Card>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        v = inflater.inflate(R.layout.fragment_home, container, false)
        c = v.context
        spe.setupSharedPreferencesEditor(c)
        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        autoFitRecyclerView = v.findViewById(R.id.auto_fit_recycler_view)
        inflateStationList()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            updateFavourites = activity as UpdateFavourites
        } catch (e: ClassCastException) {
            throw ClassCastException("Error in retrieving data. Please try again")
        }
    }

    internal interface UpdateFavourites {
        fun onFavouriteAdded()
    }

    override fun onCardClicked(holder: CardViewHolder, position: Int) {

        val playButton = (context as Activity).findViewById<ImageButton>(R.id.play_ImageButton)
        playButton.isEnabled = false
        playButton.setImageResource(R.drawable.radio_pause_icon)

        //Play(RadioPlayer.instance.mediaPlayer).execute(listOfStations[position].url)

        val play = Play(RadioPlayer.instance.mediaPlayer)
        play.setupPlay(activity as MainActivity)
        play.execute(listOfStations[position].url)

        activity!!.station_name_textView.text = listOfStations[position].title
        spe.setCurrentStation(listOfStations[position])
    }

    override fun onCardLongClicked(holder: CardViewHolder, position: Int) {
        val favouriteList = spe.getFavouriteList()
        if (favouriteList.contains(listOfStations[position])) {
            Toast.makeText(c, getString(R.string.already_added_to_favourites), Toast.LENGTH_SHORT).show()
        } else {
            showAlertDialog(favouriteList, position)
        }

    }

    fun inflateStationList() {
        listOfStations = spe.getCurrentList()
        autoFitRecyclerView.adapter = RecyclerViewAdapter(listOfStations, this)
    }

    private fun showAlertDialog(favouriteList: ArrayList<Card>, position: Int) {
        val builder = AlertDialog.Builder(c, R.style.DialogTheme)
        builder.setTitle(getString(R.string.add_to_favourites))

        val container = FrameLayout(c)
        val params = FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            250
        )
        container.layoutParams = params
        builder.setView(container)

        builder.setPositiveButton(getString(R.string.add)) { _, _ ->
            val station = listOfStations[position]
            favouriteList.add(station)
            spe.setFavouriteList(favouriteList)
            updateFavourites.onFavouriteAdded()
        }
        builder.setNegativeButton(getString(R.string.cancel), null)
        dialog = builder.create()
        dialog.show()
    }

}