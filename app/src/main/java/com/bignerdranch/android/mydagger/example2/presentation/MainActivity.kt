package com.bignerdranch.android.mydagger.example2.presentation


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bignerdranch.android.mydagger.R
import com.bignerdranch.android.mydagger.example1.Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val activity = Activity()
        activity.computer.toString()
//        activity.storage.toString()
//

    }
}