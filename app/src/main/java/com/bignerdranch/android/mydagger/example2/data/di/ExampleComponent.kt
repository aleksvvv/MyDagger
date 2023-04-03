package com.bignerdranch.android.mydagger.example2.data.di

import android.content.Context
import com.bignerdranch.android.mydagger.example2.presentation.MainActivity
import com.bignerdranch.android.mydagger.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class])
interface ExampleComponent {

//    fun inject(activity: MainActivity)
//    fun inject(activity: MainActivity2)
    fun activityComponentFactory():ActivityComponent.Factory

    @Component.Factory
    interface ExampleComponentFactory{

        fun create(
           @BindsInstance context: Context,
           @BindsInstance time: Long
        ):ExampleComponent
    }
}