package com.harshul.dependencyinjection.utils

import android.app.Application
import com.harshul.dependencyinjection.component.AppComponent
import com.harshul.dependencyinjection.component.DaggerAppComponent

class UserApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().build()

    }

}