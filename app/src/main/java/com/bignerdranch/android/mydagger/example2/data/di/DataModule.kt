package com.bignerdranch.android.mydagger.example2.data.di

import com.bignerdranch.android.mydagger.example2.data.datasource.ExampleLocalDataSource
import com.bignerdranch.android.mydagger.example2.data.datasource.ExampleLocalDataSourceImpl
import com.bignerdranch.android.mydagger.example2.data.datasource.ExampleRemoteDataSource
import com.bignerdranch.android.mydagger.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun provLocalData(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource {
        return impl
    }

    @Provides
    fun provRemoteData(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource {
        return impl
    }
}