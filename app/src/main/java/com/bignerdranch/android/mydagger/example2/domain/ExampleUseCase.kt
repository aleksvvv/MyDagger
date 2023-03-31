package com.bignerdranch.android.mydagger.example2.domain

class ExampleUseCase(
    private val repository: ExampleRepository
) {
    operator fun invoke(){
        repository.metod()
    }
}