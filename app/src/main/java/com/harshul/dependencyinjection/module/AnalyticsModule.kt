package com.harshul.dependencyinjection.module

import com.harshul.dependencyinjection.service.AnalyticsService
import com.harshul.dependencyinjection.service.FirebaseAnalytics
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AnalyticsModule() {

    @Singleton
    @Provides
    fun getAnalyticsService(): AnalyticsService {
        return FirebaseAnalytics()
    }

}