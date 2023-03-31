package com.bignerdranch.android.mydagger.example2.data.di


import com.bignerdranch.android.mydagger.example2.presentation.MainActivity
import dagger.Component

@Component(modules = [DataModule::class,DomainModule::class,ContextModule::class])
interface ExampleComponent {

fun inject(activity: MainActivity)
}