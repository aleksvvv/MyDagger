package com.bignerdranch.android.mydagger.example2.data.di

import android.content.Context
import com.bignerdranch.android.mydagger.example2.data.database.ExampleDatabase
import com.bignerdranch.android.mydagger.example2.presentation.ExampleViewModel
import com.bignerdranch.android.mydagger.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class])
interface ExampleComponent {

    fun inject(activity: MainActivity)

    @Component.Factory
    interface ExampleComponentFactory{

        fun create(
           @BindsInstance context: Context,
           @BindsInstance time: Long
        ):ExampleComponent
    }
}