package com.bignerdranch.android.mydagger.example2.presentation

import com.bignerdranch.android.mydagger.example2.domain.ExampleUseCase
import javax.inject.Inject


class ExampleViewModel @Inject constructor (
    private val useCase: ExampleUseCase
) {

    fun method() {
        useCase()
    }
}