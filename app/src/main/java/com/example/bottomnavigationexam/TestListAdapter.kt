package com.example.bottomnavigationexam

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_test.view.*

class TestListAdapter (
    private val context : Context,
    private val listItems : List<String>
) : RecyclerView.Adapter<TestListAdapter.ItemViewHolder>() {

    private lateinit var rememberListener : ItemClickListener

    fun rememberListener(listener : ItemClickListener) {
        this.rememberListener = listener
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_test, parent,false)
        )
    }

    override fun getItemCount(): Int {
        return listItems.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind()
    }
    inner class ItemViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        fun bind() {
            val position = adapterPosition
            val item = listItems[position]
            itemView.number.text = item

            itemView.setOnClickListener {
                rememberListener.onClick(item)
            }
        }
    }
}