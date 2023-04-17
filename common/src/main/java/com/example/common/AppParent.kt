package com.example.common

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
abstract class AppParent : Application()  {

    companion object {
        var appId: String? = null
    }

    protected abstract fun getApiKey(): String

    override fun onCreate() {
        super.onCreate()
        appId = getApiKey()
    }

}