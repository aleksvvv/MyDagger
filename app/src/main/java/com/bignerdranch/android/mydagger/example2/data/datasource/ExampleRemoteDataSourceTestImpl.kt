package com.bignerdranch.android.mydagger.example2.data.datasource

import android.util.Log
import com.bignerdranch.android.mydagger.example2.data.network.ExampleApiService
import javax.inject.Inject
class ExampleRemoteDataSourceTestImpl @Inject constructor(
    private val apiService: ExampleApiService
): ExampleRemoteDataSource {
    override fun metod() {
        Log.d("ExampleViewModel","Test")
    }

}