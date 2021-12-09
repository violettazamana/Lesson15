package com.mobile.myapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.mobile.myapplication.Child
import com.mobile.myapplication.OurSingleton
import com.mobile.myapplication.R
import com.mobile.myapplication.SleepPeople

class MainActivity : AppCompatActivity() {

    lateinit var buttonAdd: Button
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonAdd = findViewById(R.id.addButton)
        textView = findViewById(R.id.helloWorldTextView)
        SleepPeople().new()
        buttonAdd.setOnClickListener {
            OurSingleton.mapOfDayUsages.add(com.mobile.myapplication.model.Person())
            OurSingleton.mapOfDayUsages.add(Child(number = 1))
            textView.text = OurSingleton.mapOfDayUsages[0].toString()
        }
        OurSingleton.calculate()
    }

    companion object {

        val i = 0

        fun setQaw() = 0
    }
}