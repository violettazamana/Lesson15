package com.mobile.myapplication.model

open class Animal(
    open val color: String,
    open val name: String
)

open class Hunters(
    open val countEat: Int,
    override val color: String,
    override val name: String
) : Animal(
    color,
    name
)

data class Tiger(
    val paroda: String,
    override val countEat: Int,
    override val color: String,
    override val name: String
) : Hunters(
    countEat,
    color,
    name
)
