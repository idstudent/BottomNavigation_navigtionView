package com.example.bottomnavigationexam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class HomeDetailFragment : Fragment(R.layout.fragment_home_detail) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val mainAct = activity as MainActivity
        mainAct.hideBottomNavi(true)
    }

    // 안해주면 뒤로가기 해도 바텀메뉴가 안돌아오기 때문에 해줘야됨
    override fun onDestroy() {
        super.onDestroy()

        val mainAct = activity as MainActivity
        mainAct.hideBottomNavi(false)
    }
}