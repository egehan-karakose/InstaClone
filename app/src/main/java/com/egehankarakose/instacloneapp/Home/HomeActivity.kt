package com.egehankarakose.instacloneapp.Home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.egehankarakose.instacloneapp.Home.CameraFragment
import com.egehankarakose.instacloneapp.Home.HomeFragment
import com.egehankarakose.instacloneapp.Home.MessageFragment
import com.egehankarakose.instacloneapp.R
import com.egehankarakose.instacloneapp.utils.BottomNavigationViewHelper
import com.egehankarakose.instacloneapp.utils.HomePagesAdapter
import kotlinx.android.synthetic.main.activity_main.*

class HomeActivity : AppCompatActivity() {

    private val ACTIVITY_NO = 0
    private val TAG = "HomeActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setupNavigationView()
        setupHomeViewPager()
    }



    fun setupNavigationView(){
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView)
        BottomNavigationViewHelper.setupNavigation(this,bottomNavigationView)
        var menu= bottomNavigationView.menu
        var menuItem=menu.getItem(ACTIVITY_NO)
        menuItem.setChecked(true)

    }
    private fun setupHomeViewPager() {
        var homePagesAdapter = HomePagesAdapter(supportFragmentManager)
        homePagesAdapter.addFragment(CameraFragment())
        homePagesAdapter.addFragment(HomeFragment())
        homePagesAdapter.addFragment(MessageFragment())

        homeViewPager.adapter=homePagesAdapter
        homeViewPager.setCurrentItem(1)

    }
}
