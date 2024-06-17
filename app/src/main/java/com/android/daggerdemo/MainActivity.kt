package com.android.daggerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.android.DaggerActivity
import dagger.internal.DaggerCollections
import dagger.internal.DaggerGenerated

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userRegistrationDagger = DaggerUserRegistrationComponent.builder().build()
//        userRegistrationDagger.getUserRegistrationService().getUserRegistration()

        userRegistrationDagger.getEmailService().getEmailVerification()
//       val userRegistrationComponent
    }
}