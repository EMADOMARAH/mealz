package com.emad.omarah.mealz.di

import com.emad.omarah.domain.repo.MealsRepo
import com.emad.omarah.domain.usecase.GetMealz
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)

object UseCaseModule {
    @Provides
    fun provideUseCase(mealsRepo: MealsRepo):GetMealz{
        return GetMealz(mealsRepo)
    }
}