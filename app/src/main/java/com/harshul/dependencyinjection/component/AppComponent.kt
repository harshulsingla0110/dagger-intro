package com.harshul.dependencyinjection.component

import com.harshul.dependencyinjection.module.AnalyticsModule
import com.harshul.dependencyinjection.service.AnalyticsService
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {

   fun getUserRegistrationComponentFactory() : UserRegistrationComponent.Factory

   //if no factory is required
   //getUserRegistrationComponent() : UserRegistrationComponent
}