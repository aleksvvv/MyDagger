package com.bignerdranch.android.mydagger.example2.data.database

import android.content.Context
import android.util.Log
import com.bignerdranch.android.mydagger.R
import com.bignerdranch.android.mydagger.example2.data.di.ApplicationScope
import javax.inject.Inject



class ExampleDatabase @Inject constructor(
    private val context: Context,
    private val time: Long
) {
    fun method() {
        Log.d(LOG_TAG, "ExampleDatabase ${context.getString(R.string.app_name)} $time $this")
    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}