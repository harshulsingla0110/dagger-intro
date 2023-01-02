package com.harshul.dependencyinjection.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.harshul.dependencyinjection.R
import com.harshul.dependencyinjection.service.UserRegistrationService
import com.harshul.dependencyinjection.utils.UserApplication
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = (application as UserApplication).appComponent

        val userRegistrationComponent =
            appComponent.getUserRegistrationComponentFactory().create(300)
        userRegistrationComponent.injectInMainActivity(this)

        userRegistrationService.registerUser("abc@gmail.com", "1234")

    }
}