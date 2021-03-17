package com.example.radioapp

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.widget.SwitchCompat
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.example.radioapp.SharedPreferencesEditor.Companion.AUTOMATIC_DISPLAY
import com.example.radioapp.SharedPreferencesEditor.Companion.SHOW_AUDIO_VISUALIZER
import com.example.radioapp.SharedPreferencesEditor.Companion.SHOW_PLAY_BUTTON
import kotlinx.android.synthetic.main.fragment_settings.*


class SettingsFragment: androidx.fragment.app.Fragment() {

    private lateinit var v: View
    private lateinit var c: Context
    private val m = MainActivity()

    private var spe = SharedPreferencesEditor()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        v = inflater.inflate(R.layout.fragment_settings, container, false)
        c = v.context
        spe.setupSharedPreferencesEditor(c)
        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (spe.getStatus(SHOW_PLAY_BUTTON, true)) { show_play_button_switchCompat.isChecked = true }
        if (spe.getStatus(SHOW_AUDIO_VISUALIZER, false)) { show_audio_visualizer_switchCompat.isChecked = true }
        if (spe.getStatus(AUTOMATIC_DISPLAY, false)) { automatic_display_switchCompat.isChecked = true }

        val playButton = (context as Activity).findViewById<ImageButton>(R.id.play_ImageButton)
        val stationName = (context as Activity).findViewById<TextView>(R.id.station_name_textView)
        val visualizerView = (context as Activity).findViewById<VisualizerView>(R.id.visualizerView)

        val stationParams = stationName.layoutParams as CoordinatorLayout.LayoutParams

        show_play_button_switchCompat.setOnCheckedChangeListener { _, isChecked ->
            spe.setStatus(SHOW_PLAY_BUTTON, isChecked)
            if (isChecked) {
                stationParams.gravity = (Gravity.BOTTOM or Gravity.START)
                playButton.visibility = ImageButton.VISIBLE
            } else {
                stationParams.gravity = (Gravity.BOTTOM or Gravity.CENTER)
                playButton.visibility = ImageButton.GONE
            }
            stationName.layoutParams = stationParams
        }
        show_audio_visualizer_switchCompat.setOnCheckedChangeListener { it, isChecked ->
            if (m.checkPermissions(c))  {
                spe.setStatus(SHOW_AUDIO_VISUALIZER, isChecked)

                //Play(RadioPlayer.instance.mediaPlayer).setupVisualizer(c)
                Play(RadioPlayer.instance.mediaPlayer).setupVisualizer(m)

                if (isChecked) {
                    visualizerView.visibility = View.VISIBLE
                } else {
                    visualizerView.visibility = View.GONE
                }
            } else {
                it.isChecked = false
            }
        }
        automatic_display_switchCompat.setOnCheckedChangeListener { _, isChecked ->
            spe.setStatus(AUTOMATIC_DISPLAY, isChecked)
        }
    }

    fun visualizerChecked(context: Context) {
        spe.setupSharedPreferencesEditor(context)
        spe.setStatus(SHOW_AUDIO_VISUALIZER, true)
        Play(RadioPlayer.instance.mediaPlayer).setupVisualizer(m)
        val visualizerView = (context as Activity).findViewById<VisualizerView>(R.id.visualizerView)
        val visualizerSwitch = (context).findViewById<SwitchCompat>(R.id.show_audio_visualizer_switchCompat)
        visualizerView.visibility = View.VISIBLE
        visualizerSwitch.isChecked = true
    }

}