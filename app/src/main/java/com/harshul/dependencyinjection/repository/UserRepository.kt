package com.harshul.dependencyinjection.repository

import android.util.Log
import com.harshul.dependencyinjection.utils.ActivityScope
import com.harshul.dependencyinjection.service.AnalyticsService
import javax.inject.Inject

interface UserRepository {
    fun saveUser(email: String, password: String)
}

@ActivityScope
class SQLRepository @Inject constructor(val analyticsService: AnalyticsService) : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d("TAG", "User saved in DB")
        analyticsService.trackEvent("save User", "CREATE")
    }
}

class FirebaseRepository(val analyticsService: AnalyticsService) : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d("TAG", "User saved in firebase")
        analyticsService.trackEvent("save User", "CREATE")
    }

}