package com.bignerdranch.android.mydagger.example2.presentation


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bignerdranch.android.mydagger.R
import com.bignerdranch.android.mydagger.example1.DaggerNewComponent
import com.bignerdranch.android.mydagger.example2.data.di.DaggerExampleComponent
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel
    private val component = DaggerExampleComponent.create()

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.method()

    }
}