package com.example.radioapp

import android.Manifest
import android.app.Activity
import android.content.Context
import android.media.MediaPlayer
import android.media.audiofx.Visualizer
import android.os.AsyncTask
import android.widget.ImageButton
import androidx.core.content.PermissionChecker
import java.io.IOException
import java.lang.ref.WeakReference

class Play(private val mediaPlayer: MediaPlayer): AsyncTask<String, Void, Boolean>() {

    var prepared = false

    lateinit var visualizer: Visualizer

    private lateinit var activityReference: WeakReference<MainActivity>

    fun setupPlay(context: MainActivity) {
        activityReference = WeakReference(context)
    }

    override fun doInBackground(vararg strings: String): Boolean? {
        try {
            mediaPlayer.reset()
            mediaPlayer.setDataSource(strings[0])
            mediaPlayer.prepare()
            prepared = true
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return prepared
    }

    override fun onPostExecute(aBoolean: Boolean?) {
        super.onPostExecute(aBoolean)
        mediaPlayer.start()

        val activity = activityReference.get()!!
        val context = activity.applicationContext
        if (hasPermissions(context)) {
            setupVisualizer(activity)
        }
        val pauseButton = activity.findViewById<ImageButton>(R.id.play_ImageButton)
        pauseButton.isEnabled = true
    }

    fun pausePlayer(playButton: ImageButton) {
        if (mediaPlayer.isPlaying) {
            playButton.setImageResource(R.drawable.radio_play_icon)
            mediaPlayer.pause()
        } else {
            playButton.setImageResource(R.drawable.radio_pause_icon)
            mediaPlayer.start()
        }
    }

    fun setupVisualizer(activity: MainActivity) {
        val visualizerView = activity.findViewById<VisualizerView>(R.id.visualizerView)

        visualizer = Visualizer(RadioPlayer.instance.mediaPlayer.audioSessionId)
        visualizer.enabled = false
        visualizer.captureSize = Visualizer.getCaptureSizeRange()[1]
        visualizer.setDataCaptureListener(
            object : Visualizer.OnDataCaptureListener {
                override fun onWaveFormDataCapture(
                    visualizer: Visualizer, bytes: ByteArray, samplingRate: Int) {
                    visualizerView.updateVisualizer(bytes)
                }

                override fun onFftDataCapture(
                    visualizer: Visualizer, bytes: ByteArray, samplingRate: Int) {
                }
            }, Visualizer.getMaxCaptureRate() / 2, true, false
        )
        visualizer.enabled = true
    }

    private fun hasPermissions(c: Context): Boolean {
        return PermissionChecker.checkSelfPermission(c, Manifest.permission.RECORD_AUDIO) == PermissionChecker.PERMISSION_GRANTED
    }

}