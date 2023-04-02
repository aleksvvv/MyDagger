package com.bignerdranch.android.mydagger.example2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bignerdranch.android.mydagger.example2.data.di.ApplicationScope
import com.bignerdranch.android.mydagger.example2.domain.ExampleUseCase
import javax.inject.Inject
import javax.inject.Provider

@ApplicationScope
class ViewModelFactory @Inject constructor(
    private val viewModelProvider: @JvmSuppressWildcards Map<String,Provider<ViewModel>>
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return viewModelProvider[modelClass.simpleName]?.get() as T
    }
}