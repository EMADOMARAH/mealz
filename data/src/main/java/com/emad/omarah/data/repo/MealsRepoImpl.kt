package com.emad.omarah.data.repo

import com.emad.omarah.data.remote.ApiService
import com.emad.omarah.domain.entity.CategoryRespose
import com.emad.omarah.domain.repo.MealsRepo

class MealsRepoImpl (private val apiService: ApiService) : MealsRepo {
    override suspend fun getMealsFromRemote(): CategoryRespose {
       return apiService.getMeals()
    }

}