package com.bignerdranch.android.mydagger.example2.data.datasource

import com.bignerdranch.android.mydagger.example2.data.network.ExampleApiService

class ExampleRemoteDataSourceImpl(
    private val apiService: ExampleApiService
): ExampleRemoteDataSource {
    override fun metod() {
        apiService.method()
    }

}