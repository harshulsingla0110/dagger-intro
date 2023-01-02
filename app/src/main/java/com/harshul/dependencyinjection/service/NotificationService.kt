package com.harshul.dependencyinjection.service

import android.util.Log
import com.harshul.dependencyinjection.utils.ActivityScope
import javax.inject.Inject

interface NotificationService {
    fun send(email: String, from: String, body: String)
}

@ActivityScope
class EmailService @Inject constructor() : NotificationService {
    override fun send(email: String, from: String, body: String) {
        Log.d("TAG", "Email sent")
    }
}

class MessageService(private val retryCount : Int) : NotificationService {
    override fun send(email: String, from: String, body: String) {
        Log.d("TAG", "Message sent : $retryCount")
    }
}