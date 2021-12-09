package com.mobile.myapplication

import com.mobile.myapplication.model.Person

class SleepPeople() {

    var person4: Person? = null

    fun new() {

        val pr = when{
            "".equals("")->{
                Person()
            }
            else->{
                Person()
            }
        }
        sleep(name = "Ilona")
        val lkj: Int = sum(1, 2)
        withParLamda(1, { qwqwedswad, a -> sum1 }, {})
        val person1 = com.mobile.myapplication.model.Person()
        person1.firstName = "Ilona"
        person1.lastName = "Sosna"
        person1.age = 18
        person1.fullName = person1.firstName + " " + person1.lastName
        OurSingleton.month = 12
        OurSingleton.mapOfDayUsages.add("12 dec")
        person4?.apply {

        }
        val person2 = com.mobile.myapplication.model.Person().apply {
            firstName = "Evgeniy"
            lastName = "Poznyak"
            age = 18
            fullName = firstName + " " + lastName
        }
        val person3 = person2.run {
            firstName = "Evgeniy"
            lastName = "Poznyak"
            age = 18
            fullName = firstName + " " + lastName
            this
        }
    }
}

open class Person(
    var firstName: String? = "",
    var lastName: String? = "",
    var fullName: String? = "",
    var age: Int? = 0
)

class Child(
    var number: Int
) : Person()

fun sleep(name: String, duration: Long = 8000, whereSleep: String? = null) {
    whereSleep?.plus("qwe")
}

fun sum(x: Int, y: Int) = x + y

val sum1 = { x: Int, y: Int ->
    x + y
}

fun withParLamda(x: Int, qaw: (q: Int, a: Int) -> Unit, asq: () -> Unit) {
    val t = qaw(1, 2)
}