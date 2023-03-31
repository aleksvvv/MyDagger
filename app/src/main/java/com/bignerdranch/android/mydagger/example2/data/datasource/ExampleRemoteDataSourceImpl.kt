package com.bignerdranch.android.mydagger.example2.data.datasource

import com.bignerdranch.android.mydagger.example2.data.network.ExampleApiService
import javax.inject.Inject
class ExampleRemoteDataSourceImpl @Inject constructor(
    private val apiService: ExampleApiService
): ExampleRemoteDataSource {
    override fun metod() {
        apiService.method()
    }

}