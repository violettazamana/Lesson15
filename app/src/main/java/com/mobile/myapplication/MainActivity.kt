package com.mobile.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

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
            OurSingleton.mapOfDayUsages.add(Person())
            OurSingleton.mapOfDayUsages.add(Child(number = 1))
            textView.text = OurSingleton.mapOfDayUsages[0].toString()
        }
    }
}