package com.egehankarakose.instacloneapp.utils

import android.content.Context
import android.content.Intent
import android.view.MenuItem
import androidx.core.content.ContextCompat.startActivity
import com.egehankarakose.instacloneapp.Home.HomeActivity
import com.egehankarakose.instacloneapp.News.NewsActivity
import com.egehankarakose.instacloneapp.Profile.ProfileActivity
import com.egehankarakose.instacloneapp.Search.SearchActivity
import com.egehankarakose.instacloneapp.Share.ShareActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx
import com.ittianyu.bottomnavigationviewex.R
import java.security.AccessControlContext

class BottomNavigationViewHelper {
    companion object {
        fun setupBottomNavigationView(bottomNavigationViewEx: BottomNavigationViewEx ){

            bottomNavigationViewEx.enableAnimation(false)
            bottomNavigationViewEx.enableItemShiftingMode(false)
            bottomNavigationViewEx.enableShiftingMode(false)
            bottomNavigationViewEx.setTextVisibility(false)


        }

        fun setupNavigation(context: Context,bottomNavigationViewEx: BottomNavigationViewEx){

            bottomNavigationViewEx.onNavigationItemSelectedListener=object :BottomNavigationView.OnNavigationItemSelectedListener{
                override fun onNavigationItemSelected(p0: MenuItem): Boolean {
                    when(p0.itemId){
                        com.egehankarakose.instacloneapp.R.id.ic_home -> {

                            val intent= Intent(context,HomeActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true

                        }
                        com.egehankarakose.instacloneapp.R.id.ic_seach -> {

                            val intent= Intent(context, SearchActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true

                        }
                        com.egehankarakose.instacloneapp.R.id.ic_share -> {

                            val intent= Intent(context, ShareActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true

                        }
                        com.egehankarakose.instacloneapp.R.id.ic_news -> {

                            val intent= Intent(context, NewsActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true

                        }
                        com.egehankarakose.instacloneapp.R.id.ic_profile -> {

                            val intent= Intent(context, ProfileActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true

                        }
                    }
                    return false



                }
            }

        }


    }
}