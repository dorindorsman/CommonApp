package com.example.common

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ConvertorViewModel @Inject constructor() : ViewModel() {

    companion object {
        const val TAG = "ConvertorViewModel"
    }

    val genderTypes = listOf("Baby's", "Kid's", "Women's", "Men's")
    val sizeTypes = SizeType.values().map { it.name }
    val result = mutableStateOf("Your Result")
}