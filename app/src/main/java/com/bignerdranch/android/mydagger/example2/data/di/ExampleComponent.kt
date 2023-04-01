package com.bignerdranch.android.mydagger.example2.data.di

import android.content.Context
import com.bignerdranch.android.mydagger.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class])
interface ExampleComponent {

    fun inject(activity: MainActivity)

    @Component.Builder
    interface ExampleComponentBuilder {

        @BindsInstance
        fun context(context: Context): ExampleComponentBuilder

        fun build(): ExampleComponent
    }
}