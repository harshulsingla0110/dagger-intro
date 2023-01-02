package com.harshul.dependencyinjection.component

import com.harshul.dependencyinjection.module.NotificationServiceModule
import com.harshul.dependencyinjection.module.RepositoryModule
import com.harshul.dependencyinjection.utils.ActivityScope
import com.harshul.dependencyinjection.view.MainActivity
import dagger.BindsInstance
import dagger.Subcomponent

@ActivityScope
@Subcomponent(
    modules = [NotificationServiceModule::class, RepositoryModule::class]
)
interface UserRegistrationComponent {

    fun injectInMainActivity(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance retryCount: Int
        ): UserRegistrationComponent
    }
}