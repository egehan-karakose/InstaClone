package com.egehankarakose.instacloneapp.News

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.egehankarakose.instacloneapp.R
import com.egehankarakose.instacloneapp.utils.BottomNavigationViewHelper
import kotlinx.android.synthetic.main.activity_main.*

class NewsActivity : AppCompatActivity() {

    private val ACTIVITY_NO = 3
    private val TAG = "NewsActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupNavigationView()
    }
    fun setupNavigationView(){
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView)
        BottomNavigationViewHelper.setupNavigation(this,bottomNavigationView)
        var menu= bottomNavigationView.menu
        var menuItem=menu.getItem(ACTIVITY_NO)
        menuItem.setChecked(true)

    }
}