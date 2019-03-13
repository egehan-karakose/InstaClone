package com.egehankarakose.instacloneapp.Profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.egehankarakose.instacloneapp.R
import com.egehankarakose.instacloneapp.utils.BottomNavigationViewHelper
import kotlinx.android.synthetic.main.activity_profile_settings.*


class ProfileSettingsActivity : AppCompatActivity() {

    private val ACTIVITY_NO = 4
    private val TAG = "ProfileActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_settings)

        setupToolbar()
        setupNavigationView()
    }

    private fun setupToolbar() {
        profileSettingsBackButton.setOnClickListener {
            onBackPressed()
        }
    }


    fun setupNavigationView(){
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView)
        BottomNavigationViewHelper.setupNavigation(this,bottomNavigationView)
        var menu= bottomNavigationView.menu
        var menuItem=menu.getItem(ACTIVITY_NO)
        menuItem.setChecked(true)

    }
}
