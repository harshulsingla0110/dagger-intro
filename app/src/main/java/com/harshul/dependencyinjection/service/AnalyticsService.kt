package com.harshul.dependencyinjection.service

import android.util.Log

interface AnalyticsService {

    fun trackEvent(eventName: String, eventType: String)

}

class FirebaseAnalytics : AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("TAG", "FirebaseAnalytics: $eventName : $eventType")
    }
}

class Mixpanel : AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("TAG", "Mixpanel: $eventName : $eventType")
    }
}