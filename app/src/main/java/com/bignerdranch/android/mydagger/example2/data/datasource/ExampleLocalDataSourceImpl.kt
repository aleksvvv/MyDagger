package com.bignerdranch.android.mydagger.example2.data.datasource

import com.bignerdranch.android.mydagger.example2.data.database.ExampleDatabase

class ExampleLocalDataSourceImpl (
    private val database: ExampleDatabase
    ) : ExampleLocalDataSource   {

    override fun metod() {
        database.method()
    }
}

