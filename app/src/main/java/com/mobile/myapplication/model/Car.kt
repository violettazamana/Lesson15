package com.mobile.myapplication.model

class Box<M : Car>(t: M) {
    var value = t

    fun werewr() {
        value.calculateCost()
    }
}

fun createBox() {
    arrayListOf<Car>().apply {
        add(Car())
        val car: Car = get(0) as AudioCar
    }

    val car = AudioCar()
    val box = Box<AudioCar>(car)
}

class Airplane()

class AudioCar() : Car() {

}

open class Car() {
    public var type: String
        get() = "$type/n"
        private set(value) {
            this.type = type
        }

    fun calculateCost() = 1200

//    fun getType(): String {
//        return "$type/n"
//    }
//
//    fun setType(type: String) {
//        this.type = type
//    }
}