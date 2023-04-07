package com.emad.omarah.data.remote

import com.emad.omarah.domain.entity.CategoryRespose
import retrofit2.http.GET

interface ApiService {
    @GET("categories.php")
   suspend fun getMeals():CategoryRespose
}