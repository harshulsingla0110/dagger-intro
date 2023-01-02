package com.harshul.dependencyinjection.module

import com.harshul.dependencyinjection.utils.ActivityScope
import com.harshul.dependencyinjection.utils.EmailQualifier
import com.harshul.dependencyinjection.service.EmailService
import com.harshul.dependencyinjection.service.MessageService
import com.harshul.dependencyinjection.service.NotificationService
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class  NotificationServiceModule() {

    @ActivityScope
    @Named("message")
    @Provides
    fun getMessagingService(count: Int): NotificationService {
        return MessageService(count)
    }

    @ActivityScope
    @EmailQualifier
    @Provides
    fun getEmailService(): NotificationService {
        return EmailService()
    }

}