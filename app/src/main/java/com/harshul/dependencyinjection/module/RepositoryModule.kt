package com.harshul.dependencyinjection.module

import com.harshul.dependencyinjection.utils.ActivityScope
import com.harshul.dependencyinjection.repository.SQLRepository
import com.harshul.dependencyinjection.repository.UserRepository
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {

    @Binds
    @ActivityScope
    abstract fun getRepository(sqlRepository: SQLRepository): UserRepository

}