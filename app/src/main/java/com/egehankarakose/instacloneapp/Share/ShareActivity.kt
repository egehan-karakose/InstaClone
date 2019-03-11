package com.egehankarakose.instacloneapp.Share

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.egehankarakose.instacloneapp.R
import com.egehankarakose.instacloneapp.utils.BottomNavigationViewHelper
import kotlinx.android.synthetic.main.activity_main.*

class ShareActivity : AppCompatActivity() {

    private val ACTIVITY_NO = 2
    private val TAG = "ShareActivity"

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