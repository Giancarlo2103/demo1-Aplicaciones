package com.example.a17j901.demo2.ui.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.*
import com.example.a17j901.demo2.R
import com.example.a17j901.demo2.data.entities.FlyListItem

class FlyListAdapter(val items: ArrayList<FlyListItem>,
                     val context:Context):
        RecyclerView.Adapter<FlyListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item_fly , null,false ))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

    }
}