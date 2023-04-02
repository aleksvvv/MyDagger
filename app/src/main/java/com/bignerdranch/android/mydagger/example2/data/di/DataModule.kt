package com.bignerdranch.android.mydagger.example2.data.di

import android.content.Context
import com.bignerdranch.android.mydagger.example2.data.datasource.ExampleLocalDataSource
import com.bignerdranch.android.mydagger.example2.data.datasource.ExampleLocalDataSourceImpl
import com.bignerdranch.android.mydagger.example2.data.datasource.ExampleRemoteDataSource
import com.bignerdranch.android.mydagger.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {
@ApplicationScope
    @Binds
    fun bindLocalData(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource
@ApplicationScope
    @Binds
    fun provRemoteData(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}