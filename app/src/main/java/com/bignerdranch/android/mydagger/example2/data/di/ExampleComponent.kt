package com.bignerdranch.android.mydagger.example2.data.di

import android.content.Context
import com.bignerdranch.android.mydagger.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component
import java.sql.Time

@Component(modules = [DataModule::class, DomainModule::class])
interface ExampleComponent {

    fun inject(activity: MainActivity)

    @Component.Builder
    interface ExampleComponentBuilder {

        @BindsInstance
        fun context(context: Context): ExampleComponentBuilder
        @BindsInstance
        fun timeCurrent(time: Long): ExampleComponentBuilder
        fun build(): ExampleComponent
    }
}