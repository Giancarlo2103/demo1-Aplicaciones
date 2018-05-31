package com.example.a17j901.demo2.data.entities

import android.support.annotation.IntegerRes
import java.util.*

 class FlyListemFly( val originDate: Date,
                    val originCity: String,
                    val destinationDate:Date,
                    val destinationCity:String,
                    val airlineLog: Int )


{
    fun getFlyDuration() :Long {
        return  destinationDate.time -originDate.time
    }
    fun getFlyLongerThanDay() :Int{
        return  ((destinationDate.time - originDate.time)/60*60*24).toInt()
    }
}