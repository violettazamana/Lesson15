package com.mobile.myapplication.utils

import com.mobile.myapplication.model.Person

class PersonForServer(
    val name: String,
    val age: Int
)

fun PersonForServer.getViewName() = "$name $age"

val arrayList = arrayListOf<Person>(
    com.mobile.myapplication.model.Person(firstName = "Zlata", age = 29),
    com.mobile.myapplication.model.Person(firstName = "Marina", age = 18)
)
var arrayList1 = emptyList<Person>()
val set1 = setOf<Person>()
val map1 = mapOf<String, Person>()

fun initList() {
    val list = emptyList<Person>()
    arrayList.add(com.mobile.myapplication.model.Person(firstName = "Egor", age = 25))
    arrayList1 = list
    OurSingleton.mapOfDayUsages.firstOrNull()
    arrayList.filter { it.age!! > 21 }
    arrayList.sortBy { it.age }
    arrayList.find { it.age == 18 }
    val df = arrayList.findLast { it.age == 18 }?.fullName
    arrayList.forEach {

    }
    val person1 = com.mobile.myapplication.model.Person("qweqwe", "wadas", "", 12)
    val listPersonForServer = arrayListOf<PersonForServer>()
    listPersonForServer.addAll(arrayList.filter { it.age!! > 21 }.map {
        PersonForServer(
            it.lastName ?: "", it.age ?: 0
        )
    })


}