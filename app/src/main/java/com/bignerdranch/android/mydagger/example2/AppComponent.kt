package com.bignerdranch.android.mydagger.example2

import android.app.Application
import com.bignerdranch.android.mydagger.example2.data.di.DaggerExampleComponent

class AppComponent: Application() {
    val component by lazy {
        DaggerExampleComponent
            .factory()
            .create(this,System.currentTimeMillis())
    }
}