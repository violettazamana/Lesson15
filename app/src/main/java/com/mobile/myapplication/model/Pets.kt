package com.mobile.myapplication.model

class GetPets() {

    var pets1: Pets? = null

    val pets = lazy {
        Pets("Пинчер")
    }

    fun asd() {
        if (pets1 != null) {

        } else {

        }
        pets1 ?: 
    }
}

open class Pets(
    open val paroda: String
)

class Cat(
    override val paroda: String,
    val isWithHair: Boolean
) : Pets(
    paroda
)

class Dog(
    override val paroda: String,
    val isDogBig: Boolean
) : Pets(
    paroda
), SayGavInt by SayGav()

class Volk(
    override val paroda: String,
    val isZloyVolk: Boolean
) : Pets(
    paroda
), SayGavInt by SayGav()

interface SayGavInt {
    fun eat()

    fun gav()
}

class SayGav() : SayGavInt {
    override fun eat() {

    }

    override fun gav() {

    }

}

interface SayMeow {

    fun meow()
}