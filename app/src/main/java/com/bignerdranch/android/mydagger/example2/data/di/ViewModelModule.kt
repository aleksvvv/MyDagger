package com.bignerdranch.android.mydagger.example2.data.di

import androidx.lifecycle.ViewModel
import com.bignerdranch.android.mydagger.example2.presentation.ExampleViewModel
import com.bignerdranch.android.mydagger.example2.presentation.ExampleViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
interface ViewModelModule {

    @IntoMap
    @StringKey("ExampleViewModel")
    @Binds
    fun bindExampleViewModel(impl:ExampleViewModel): ViewModel

    @IntoMap
    @StringKey("ExampleViewModel2")
    @Binds
    fun bindExampleViewModel2(impl: ExampleViewModel2): ViewModel
}