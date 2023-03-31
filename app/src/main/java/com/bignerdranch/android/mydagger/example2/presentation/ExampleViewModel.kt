package com.bignerdranch.android.mydagger.example2.presentation

import com.bignerdranch.android.mydagger.example2.domain.ExampleUseCase

class ExampleViewModel (
    private val useCase: ExampleUseCase
) {

    fun method() {
        useCase()
    }
}