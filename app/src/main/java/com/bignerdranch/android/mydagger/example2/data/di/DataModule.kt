package com.bignerdranch.android.mydagger.example2.data.di

import com.bignerdranch.android.mydagger.example2.data.datasource.ExampleLocalDataSource
import com.bignerdranch.android.mydagger.example2.data.datasource.ExampleLocalDataSourceImpl
import com.bignerdranch.android.mydagger.example2.data.datasource.ExampleRemoteDataSource
import com.bignerdranch.android.mydagger.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @Binds
    fun bindLocalData(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun provRemoteData(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}