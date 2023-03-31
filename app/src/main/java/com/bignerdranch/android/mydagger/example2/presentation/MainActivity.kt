package com.bignerdranch.android.mydagger.example2.presentation


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bignerdranch.android.mydagger.R


class MainActivity : AppCompatActivity() {
    lateinit var viewModel: ExampleViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.method()
    }
}