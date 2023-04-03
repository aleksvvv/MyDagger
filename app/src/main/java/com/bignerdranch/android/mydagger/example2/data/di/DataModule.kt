package com.bignerdranch.android.mydagger.example2.data.di

import android.content.Context
import com.bignerdranch.android.mydagger.example2.data.datasource.*
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
    @RemoteQualifier
    fun provRemoteData(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @ApplicationScope
    @Binds
    @RemoteTestQualifier
    fun provRemoteDataTest(impl: ExampleRemoteDataSourceTestImpl): ExampleRemoteDataSource
}