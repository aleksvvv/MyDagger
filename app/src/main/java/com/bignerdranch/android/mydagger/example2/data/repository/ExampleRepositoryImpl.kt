package com.bignerdranch.android.mydagger.example2.data.repository

import com.bignerdranch.android.mydagger.example2.data.datasource.ExampleLocalDataSource
import com.bignerdranch.android.mydagger.example2.data.datasource.ExampleRemoteDataSource
import com.bignerdranch.android.mydagger.example2.data.di.RemoteQualifier
import com.bignerdranch.android.mydagger.example2.data.di.RemoteTestQualifier
import com.bignerdranch.android.mydagger.example2.data.mapper.ExampleMapper
import com.bignerdranch.android.mydagger.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val loadDataSource: ExampleLocalDataSource,
    @RemoteQualifier private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
):ExampleRepository {
    override fun metod() {
        loadDataSource.metod()
        remoteDataSource.metod()
        mapper.map()
    }

}