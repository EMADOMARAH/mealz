package com.emad.omarah.mealz.di

import com.emad.omarah.data.remote.ApiService
import com.emad.omarah.data.repo.MealsRepoImpl
import com.emad.omarah.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {
    @Provides
    fun provideRepo(apiService: ApiService) : MealsRepo{
        return MealsRepoImpl(apiService)
    }

}