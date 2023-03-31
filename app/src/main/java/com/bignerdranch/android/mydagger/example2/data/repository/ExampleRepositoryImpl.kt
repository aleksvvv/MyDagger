package com.bignerdranch.android.mydagger.example2.data.repository

import com.bignerdranch.android.mydagger.example2.data.datasource.ExampleRemoteDataSource
import com.bignerdranch.android.mydagger.example2.data.mapper.ExampleMapper
import com.bignerdranch.android.mydagger.example2.domain.ExampleRepository

class ExampleRepositoryImpl(
    private val loadDataSource: ExampleRemoteDataSource,
    private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
):ExampleRepository {
    override fun metod() {
        loadDataSource.metod()
        remoteDataSource.metod()
        mapper.map()
    }

}