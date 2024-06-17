package com.android.daggerdemo

import javax.inject.Inject

class EmailService @Inject constructor(){

    fun getEmailVerification(){
        println("Verification Successful")
    }
}