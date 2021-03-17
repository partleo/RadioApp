package com.example.radioapp

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.example.radioapp.cardrecyclerview.Card
import com.example.radioapp.cardrecyclerview.Cards.Companion.listOfStationsFIN
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


class SharedPreferencesEditor {

    companion object {
        const val FAVOURITE_LIST = "FavouriteList"
        const val SHOW_PLAY_BUTTON = "ShowPlayButton"
        const val SHOW_AUDIO_VISUALIZER = "ShowAudioVisualizer"
        const val AUTOMATIC_DISPLAY = "AutomaticDisplay"
        const val CURRENT_LIST = "CurrentList"
        const val CURRENT_STATION = "CurrentStation"
    }

    private lateinit var c: Context
    private lateinit var sharedPreferences: SharedPreferences

    fun setupSharedPreferencesEditor(context: Context) {
        this.c = context
        this.sharedPreferences = PreferenceManager.getDefaultSharedPreferences(c)
    }

    fun setStatus(key: String, status: String) {
        sharedPreferences.edit().putString(key, status).apply()
    }

    fun getStatus(key: String, defValue: String): String {
        return sharedPreferences.getString(key, defValue) as String
    }

    fun setStatus(key: String, status: Int) {
        sharedPreferences.edit().putInt(key, status).apply()
    }

    fun getStatus(key: String, defValue: Int): Int {
        return sharedPreferences.getInt(key, defValue)
    }

    fun setStatus(key: String, status: Boolean) {
        sharedPreferences.edit().putBoolean(key, status).apply()
    }

    fun getStatus(key: String, defValue: Boolean): Boolean {
        return sharedPreferences.getBoolean(key, defValue)
    }


    fun deleteStationFromFavouriteList(station: Card) {
        val list = getFavouriteList()
        if (list.contains(station)) {
            list.remove(station)
            //Toast.makeText(c, "DELETED", Toast.LENGTH_SHORT).show()
            setFavouriteList(list)
        }
        else {
            //Toast.makeText(c, "NOT DELETED !!!", Toast.LENGTH_SHORT).show()
        }
    }

    fun <T> setFavouriteList(list: List<T>) {
        val json = Gson().toJson(list)
        setStatus(FAVOURITE_LIST, json)
    }

    fun getFavouriteList(): ArrayList<Card> {
        var arrayItems: ArrayList<Card> = arrayListOf()
        val serializedObject = sharedPreferences.getString(FAVOURITE_LIST, null)
        if (serializedObject != null) {
            val type = object : TypeToken<List<Card>>() {

            }.type
            arrayItems = Gson().fromJson(serializedObject, type)
        }
        return arrayItems
    }

    fun <T> setCurrentList(list: List<T>) {
        val json = Gson().toJson(list)
        setStatus(CURRENT_LIST, json)
    }

    fun getCurrentList(): ArrayList<Card> {
        var arrayItems: ArrayList<Card> = listOfStationsFIN
        val serializedObject = sharedPreferences.getString(CURRENT_LIST, null)
        if (serializedObject != null) {
            val type = object : TypeToken<List<Card>>() {

            }.type
            arrayItems = Gson().fromJson(serializedObject, type)
        }
        return arrayItems
    }

    fun setCurrentStation(station: Card) {
        val json = Gson().toJson(station)
        setStatus(CURRENT_STATION, json)
    }

    fun getCurrentStation(): Card {
        var station = Card("", 0, "")
        val serializedObject = sharedPreferences.getString(CURRENT_STATION, null)
        if (serializedObject != null) {
            val type = object : TypeToken<Card>() {

            }.type
            station = Gson().fromJson(serializedObject, type)
        }
        return station
    }


}