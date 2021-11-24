package com.startechup.fragment.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.startechup.fragment.fragment.ContactsFragment
import com.startechup.fragment.fragment.HomeFragment
import com.startechup.fragment.fragment.NotesFragment

/**
 * Created by Jennelyn Urot Peromingan on November 06, 2021, at 11:05 AM
 */
class TabPageAdapter(activity: FragmentActivity, private val tabCount: Int) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = tabCount

    override fun createFragment(position: Int): Fragment {

        return when (position) {
            0 -> HomeFragment()
            1 -> ContactsFragment()
            2 -> NotesFragment()
            else -> HomeFragment()
        }
    }
}