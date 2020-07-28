package com.example.customview.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.customview.fragments.AboutYouFragment
import com.example.customview.fragments.ContactsFragment
import com.example.customview.fragments.ProjectTasksFragment

class TabPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        when (position){
            0 -> return ProjectTasksFragment()
            1 -> return ContactsFragment()
            2 -> return AboutYouFragment()
            else -> return ProjectTasksFragment()
        }
    }

    override fun getCount(): Int {
        return 3
    }
}