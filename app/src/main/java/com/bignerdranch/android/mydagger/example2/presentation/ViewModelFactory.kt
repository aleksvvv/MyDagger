package com.bignerdranch.android.mydagger.example2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bignerdranch.android.mydagger.example2.domain.ExampleUseCase
import javax.inject.Inject

class ViewModelFactory @Inject constructor(
    private val exampleUseCase: ExampleUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass == ExampleViewModel::class.java) {
            return ExampleViewModel(exampleUseCase) as T
        } else throw java.lang.RuntimeException("")
    }
}