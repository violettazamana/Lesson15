package com.mobile.myapplication

import com.mobile.myapplication.model.Person

object OurSingleton {

    var dayOfWeek: String = ""
    var month: Int = 0

    val mapOfDayUsages: ArrayList<Person> = arrayListOf()

    fun calculate() = 1
}