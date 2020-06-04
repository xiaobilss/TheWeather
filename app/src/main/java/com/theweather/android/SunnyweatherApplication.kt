package com.theweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyweatherApplication : Application() {
    companion object{
        const val TOKEN = "t2Xf6YzzmzbfsTdE"

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}