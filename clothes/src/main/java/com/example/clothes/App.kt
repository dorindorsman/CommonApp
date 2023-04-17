package com.example.clothes

import com.example.common.AppParent

class App : AppParent() {

    override fun getApiKey(): String {
        return BuildConfig.APPLICATION_ID
    }
}