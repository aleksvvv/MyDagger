package com.bignerdranch.android.mydagger.example2.data.network

import android.content.Context
import android.util.Log
import com.bignerdranch.android.mydagger.R
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ExampleApiService @Inject constructor(
    private val context: Context,
    private val time: Long
) {
    fun method() {
        Log.d(LOG_TAG, "ExampleApiService ${context.getString(R.string.app_name)} $time $this")
    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}