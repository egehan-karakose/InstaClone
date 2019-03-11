package com.egehankarakose.instacloneapp.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class HomePagesAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private var myFragmentList:ArrayList<Fragment> = ArrayList()

    override fun getItem(position: Int): Fragment {

       return myFragmentList.get(position)
    }

    override fun getCount(): Int {
        return myFragmentList.size
    }

    // personal function
    fun addFragment(fragment: Fragment ){
        myFragmentList.add(fragment)
    }
}