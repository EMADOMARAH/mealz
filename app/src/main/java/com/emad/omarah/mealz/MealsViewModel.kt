package com.emad.omarah.mealz

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.emad.omarah.domain.entity.CategoryRespose
import com.emad.omarah.domain.usecase.GetMealz
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MealsViewModel @Inject constructor(
    private val getMealsUseCase: GetMealz
) : ViewModel() {
    private val _categories : MutableStateFlow<CategoryRespose?> = MutableStateFlow(null)
    val categories : StateFlow<CategoryRespose?> = _categories
     fun getMeals() {
        viewModelScope.launch {
            try {
               _categories.value =  getMealsUseCase()
            }catch (e: Exception) {
                Log.e("MealsViewModel", e.message.toString())
            }
        }
     }
}