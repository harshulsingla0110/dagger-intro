package com.harshul.dependencyinjection.service

import com.harshul.dependencyinjection.repository.UserRepository
import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    @Named("message") private val notificationService: NotificationService
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.send(email, "no-reply@harshul.com", "User Registered")
    }

}
