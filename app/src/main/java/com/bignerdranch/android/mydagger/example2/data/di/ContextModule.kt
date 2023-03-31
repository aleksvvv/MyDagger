package com.bignerdranch.android.mydagger.example2.data.di

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class ContextModule(private val context: Context) {

    @Provides
    fun getContext():Context{
        return context
    }
}