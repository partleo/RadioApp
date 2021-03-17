package com.example.radioapp

import android.media.AudioAttributes
import android.media.MediaPlayer

class RadioPlayer private constructor() {

    val mediaPlayer: MediaPlayer = MediaPlayer()

    init {
        mediaPlayer.setAudioAttributes(
            AudioAttributes.Builder()
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .build()
        )
    }

    companion object {
        private var radioPlayer: RadioPlayer? = null

        val instance: RadioPlayer
            get() {
                if (radioPlayer == null) {
                    radioPlayer = RadioPlayer()
                }
                return radioPlayer!!
            }
    }
}