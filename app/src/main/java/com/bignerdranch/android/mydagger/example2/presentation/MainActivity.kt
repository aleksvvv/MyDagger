package com.bignerdranch.android.mydagger.example2.presentation


import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.bignerdranch.android.mydagger.R
import com.bignerdranch.android.mydagger.example2.AppComponent
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    private val component by lazy {
        (application as AppComponent).component
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()

    }
}