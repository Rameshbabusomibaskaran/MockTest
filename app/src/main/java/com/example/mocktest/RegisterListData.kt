package com.example.mocktest

import android.util.Log

data class RegisterListData(val name:String,val email:String,val password:String,val confirmpassword:String,val role:String) {

    companion object {
        var list= ArrayList<RegistrationList>()

    }
    init {
        Log.d("hjh","sdsd")

        list.add(RegistrationList("surya","surya@gmail.com","surya@123","surya@123","Admin"))
        list.add(RegistrationList("murali","murali@gmail.com","murali@123","murali@123","Testconductor"))
        list.add(RegistrationList("rocky","rocky@gmail.com","rocky@123","rocky@123","Testconductor"))
         add()
    }
    fun add(){
        list.add(RegistrationList(name, email, password, confirmpassword,role))
        println(list.toString())
    }
}