package com.example.bottomnavigationexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null){
            setUpBottomNavigationBar()
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        setUpBottomNavigationBar()
    }

    private fun setUpBottomNavigationBar(){
        bottomNavigationView = findViewById(R.id.bottom_nav)
        val navGraphIds = listOf(R.navigation.navigation_home, R.navigation.navigation_hot, R.navigation.navigation_list, R.navigation.navigation_blank)

        bottomNavigationView.setupWithNavController(
            navGraphIds, supportFragmentManager, R.id.nav_host_container, intent
        )
    }

    // 뒤로가기 누를시 앱종료
//    override fun onBackPressed() {
//        super.onBackPressed()
//        Log.e("tag", "back")
//        finish()
//    }
}