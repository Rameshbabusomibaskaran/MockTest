package com.example.mocktest

import android.util.Log

object Authentication {

      val r:RegisterListData?=null

      fun loginauthenticate(email:String,password:String):Boolean{

          if(email=="rameshbabusb@yahoo.com" && password=="Ramesh@123")
          {
              return true
          }
          return false
      }
    fun registerdatahandlig(name:String,email:String,password: String,confirmpassword:String,role:String):Boolean{

        if((password==confirmpassword) &&( password!="" && confirmpassword!="")){

            Log.d("value","hvddnkd")
            RegisterListData(name,email,password,confirmpassword,role)
            println(RegisterListData.list.get(0))
            return true
        }
         return false
    }


}