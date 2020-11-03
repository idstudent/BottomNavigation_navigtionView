package com.example.bottomnavigationexam

import android.content.Intent
import android.content.Intent.getIntent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResultListener

class OneFragment : Fragment(R.layout.fragment_one) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setFragmentResultListener("requestKey11") { resultKey, bundle ->
            val test = bundle.getString("data", "")
            Log.e("tag", "뭐야 "+ test) // hello 나옴
        }

    }
}