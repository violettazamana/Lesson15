package com.mobile.myapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mobile.myapplication.R

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        MainActivity.i
    }
}