package com.bignerdranch.android.mydagger.example2.data.datasource

import com.bignerdranch.android.mydagger.example2.data.database.ExampleDatabase
import javax.inject.Inject
class ExampleLocalDataSourceImpl @Inject constructor (
    private val database: ExampleDatabase
    ) : ExampleLocalDataSource   {

    override fun metod() {
        database.method()
    }
}

