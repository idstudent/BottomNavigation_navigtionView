package com.example.bottomnavigationexam

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_hot.view.*

class HotFragment : Fragment(R.layout.fragment_hot) {
    private lateinit var adapter : TestListAdapter

    override fun onResume() {
        super.onResume()

        init()
    }
    private fun init() {
        val listItems = ArrayList<String>()
        for(i in 0 until 10) {
            listItems.add(i.toString())
        }
        adapter = activity?.let { TestListAdapter(it, listItems) }!!
        adapter.rememberListener(rememberListener)

        val recyclerView = view?.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView?.adapter = adapter

        val layoutManger = LinearLayoutManager(activity)
        recyclerView?.layoutManager = layoutManger

    }
    private val rememberListener = object : ItemClickListener {
        override fun onClick(item: String) {
            Log.e("tag", "what " + item)
            when(item) {
                "0" -> findNavController().navigate(R.id.action_hotFragment_to_oneFragment)
                "1" ->findNavController().navigate(R.id.action_hotFragment_to_twoFragment)
                else -> findNavController().navigate(R.id.action_hotFragment_to_twoFragment)
            }
        }
    }
}