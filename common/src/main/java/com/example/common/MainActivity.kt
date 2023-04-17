package com.example.common

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import com.example.common.theme.CommonAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
@ExperimentalAnimationApi
@ExperimentalMaterialApi
abstract class MainActivity : ComponentActivity() {

    protected abstract fun getData(): String?

    private val convertorViewModel: ConvertorViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        updateData()

        setContent {
            CommonAppTheme {
                ConvertorScreen(convertorViewModel)
            }
        }
    }

    private fun updateData(){
        getData()
    }
}