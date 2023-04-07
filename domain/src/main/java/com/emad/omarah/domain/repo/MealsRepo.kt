package com.emad.omarah.domain.repo

import com.emad.omarah.domain.entity.CategoryRespose

interface MealsRepo {
    suspend fun getMealsFromRemote(): CategoryRespose
}