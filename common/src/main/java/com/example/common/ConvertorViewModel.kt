package com.example.common

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ConvertorViewModel @Inject constructor(
    dataProvider: DataProvider,
) : ViewModel() {

    companion object {
        const val TAG = "ConvertorViewModel"
    }

    val genderTypes = GenderType.values().map { it.name }
    val sizeTypes = SizeType.values().map { it.name }
    var data = dataProvider.provide()
    var sizes = mutableStateOf(listOf<String>())
    var gender = mutableStateOf("Gender")
    var from = mutableStateOf("From")
    var to = mutableStateOf("To")
    var size = mutableStateOf("Size")
    var result = mutableStateOf("Your Result")


    fun handleEvent(event: SizeEvent) {
        when (event) {
            is SizeEvent.SetGender -> setGender(event.gender)
            is SizeEvent.SetFrom -> setFrom(event.from)
            is SizeEvent.SetTo -> setTo(event.to)
            is SizeEvent.SetSize -> setSize(event.size)
            is SizeEvent.SetResult -> TODO()
            SizeEvent.Convert -> convertSize()
            SizeEvent.SetSizeList -> setSizeList()
        }
    }

    private fun setGender(select: String) {
        gender.value = select
    }

    private fun setFrom(select: String) {
        from.value = select
    }

    private fun setTo(select: String) {
        to.value = select
    }

    private fun setSize(select: String) {
        size.value = select
    }

    private fun setSizeList() {
        if (gender.value != "Gender" && from.value != "From") {
            when (from.value) {
                SizeType.UK.name -> {
                    sizes.value = data.filter { it.gender.name == gender.value }.map { it.uk }
                }
                SizeType.US.name -> {
                    sizes.value = data.filter { it.gender.name == gender.value }.map { it.us }
                }
                SizeType.EU.name -> {
                    sizes.value = data.filter { it.gender.name == gender.value }.map { it.eu }
                }
                else -> sizes.value = emptyList()
            }
        } else {
            sizes.value = emptyList()
        }
    }

    private fun convertSize() {
        result.value = data
            .filter { it.gender.name == gender.value }
            .filter {
                when (from.value) {
                    SizeType.UK.name -> {
                        it.uk == size.value
                    }
                    SizeType.US.name -> {
                        it.us == size.value
                    }
                    SizeType.EU.name -> {
                        it.eu == size.value
                    }
                    else -> {
                        it.eu == size.value
                    }
                }
            }.map {
                when (to.value) {
                    SizeType.UK.name -> {
                        it.uk
                    }
                    SizeType.US.name -> {
                        it.us
                    }
                    SizeType.EU.name -> {
                        it.eu
                    }
                    else -> {
                        it.eu
                    }
                }
            }[0]
    }
}