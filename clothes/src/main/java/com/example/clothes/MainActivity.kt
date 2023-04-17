package com.example.clothes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.clothes.ui.theme.CommonAppTheme
import com.example.common.ActivityParent

@OptIn(ExperimentalAnimationApi::class, ExperimentalMaterialApi::class)
class MainActivity : ActivityParent() {
    override fun getData(): String? {
        return null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContent {
//            CommonAppTheme {
//                // A surface container using the 'background' color from the theme
//            }
//        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CommonAppTheme {
        Greeting("Android")
    }
}