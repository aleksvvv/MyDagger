package com.bignerdranch.android.mydagger.example2.data.di

import com.bignerdranch.android.mydagger.example2.data.repository.ExampleRepositoryImpl
import com.bignerdranch.android.mydagger.example2.domain.ExampleRepository
import dagger.Module
import dagger.Provides

@Module
class DomainModule {
    @Provides
    fun provUseCase(impl: ExampleRepositoryImpl):ExampleRepository{
        return impl
    }
}