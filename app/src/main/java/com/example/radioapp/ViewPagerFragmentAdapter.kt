package com.example.radioapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerFragmentAdapter(fragmentActivity: FragmentActivity, private val titles: Array<String>) : FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FavouritesFragment()
            1 -> StationsFragment()
            2 -> SettingsFragment()
            else -> StationsFragment()
        }
    }

    override fun getItemCount(): Int {
        return titles.size
    }
}