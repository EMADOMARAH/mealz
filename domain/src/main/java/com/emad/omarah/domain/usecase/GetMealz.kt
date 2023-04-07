package com.emad.omarah.domain.usecase

import com.emad.omarah.domain.repo.MealsRepo

class GetMealz (private val mealsRepo: MealsRepo){
    suspend operator fun invoke() = mealsRepo.getMealsFromRemote()
}