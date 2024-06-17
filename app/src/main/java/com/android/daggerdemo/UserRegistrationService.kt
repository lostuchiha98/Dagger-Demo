package com.android.daggerdemo

import javax.inject.Inject

class UserRegistrationService @Inject constructor (val emailService: EmailService,
                               val userRepository: UserRepository){

    fun getUserRegistration(){
        emailService.getEmailVerification()
        userRepository.getUserDetails()

    }


}