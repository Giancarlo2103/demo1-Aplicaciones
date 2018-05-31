package com.example.a17j901.demo2.ui.screens

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.a17j901.demo2.R
import com.example.a17j901.demo2.data.entities.FlyListItem
import com.example.a17j901.demo2.data.entities.FlyListemFly
import com.example.a17j901.demo2.ui.adapter.FlyListAdapter
import kotlinx.android.synthetic.main.activity_fly_list.*
import java.util.*

class flyListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_fly_list)
        rcvFlyList.layoutManager = LinearLayoutManager(this)
        rcvFlyList.adapter = FlyListAdapter(getFlyTemas(),this);
    }

    fun getFlyTemas() : ArrayList<FlyListItem>{
        val items : ArrayList<FlyListItem> = ArrayList()

        //
         val origin1 = FlyListemFly(

        Date ("11/12/2010"),
        "Lima",

        Date("12/12/2010"),
        "Madrid",

        R.drawable.ic_launcher_background
        )
        val item1 = FlyListItem(origin1, origin1 , 1240.50, "Delta")
        items.add(item1)

        val origin2 = FlyListemFly(

                Date ("11/12/2010"),
                "Lima",

                Date("12/12/2010"),
                "Madrid",

                R.drawable.ic_launcher_background
        )

        val item2 = FlyListItem(origin2, origin2, 1240.50, "Delta")
            items.add(item2)
        //
        return  items
    }
}

