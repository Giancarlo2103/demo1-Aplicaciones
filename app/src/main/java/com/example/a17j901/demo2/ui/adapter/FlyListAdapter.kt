package com.example.a17j901.demo2.ui.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.*
import android.widget.ImageView
import android.widget.TextView
import com.example.a17j901.demo2.R
import com.example.a17j901.demo2.data.entities.FlyListItem
import kotlinx.android.synthetic.main.list_item_fly.view.*


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
        val flyListItem : FlyListItem=items.get(position);
        //holder.imgAirline.setImageDrawable(context.getDrawable(flyListItem.origin.airlineLogo))
        holder.txtAirlines.text=flyListItem.airlines
        holder.txtCityDestination.text=flyListItem.origin.destinationCity
        holder.txtCityOrigin.text=flyListItem.origin.originCity
        holder.txtFlighTime.text=flyListItem.origin.getFlyLongerThanDay().toString()
        holder.txtPrice.text=flyListItem.price.toDouble().toString()
        holder.txtTimeDestination.text=flyListItem.origin.originDate.toString()
        holder.txtTimeOrigin.text=flyListItem.origin.destinationDate.toString()
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val imgAirline : ImageView = view.imgAirline
        val txtAirlines : TextView = view.txtAirlines
        val txtCityDestination : TextView = view.txtCityDestination;
        val txtCityOrigin: TextView = view.txtCityOrigin
        val txtFlighTime: TextView =view.txtFlightime
        val txtPrice   : TextView =view.txtPrice
        val txtTimeDestination: TextView = view.txtPrice
        val txtTimeOrigin : TextView =view.txtTimeOrigin


    }
}