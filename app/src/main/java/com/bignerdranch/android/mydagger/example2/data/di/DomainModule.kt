package com.bignerdranch.android.mydagger.example2.data.di

import com.bignerdranch.android.mydagger.example2.data.repository.ExampleRepositoryImpl
import com.bignerdranch.android.mydagger.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
interface DomainModule {

    @Binds
    fun bindUseCase(impl: ExampleRepositoryImpl):ExampleRepository
}