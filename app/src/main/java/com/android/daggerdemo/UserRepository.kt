package com.android.daggerdemo

import javax.inject.Inject

class UserRepository @Inject constructor() {

    fun getUserDetails(){
        println("User Details : Success")
    }
    fun getValue() : String= "abc"
}