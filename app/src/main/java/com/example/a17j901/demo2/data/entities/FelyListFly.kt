package com.example.a17j901.demo2.data.entities

import java.util.*

data class FelyListFly(
        val originDate: Date,
        val originCity: String,
        val destinationDate:Date,
        val destinationCity:String

)
{
    fun getFlyDuration() :Long {
        return  destinationDate.time -originDate.time
    }
    fun getFlyLongerThanDay() :Int{
        return  ((destinationDate.time - originDate.time)/60*60*24).toInt()
    }
}