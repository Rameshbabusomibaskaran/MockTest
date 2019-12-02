package com.example.mocktest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.*
import androidx.appcompat.widget.TooltipCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_registration.*
import kotlinx.android.synthetic.main.cards.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TooltipCompat.setTooltipText(editText2, "Write Your Email id");
        TooltipCompat.setTooltipText(editText3, "Write Your  Password");

        button.setOnClickListener {

            val email=editText2.text
            val passsword=editText3.text

            e

            val authenticate:Authentication
            if(Authentication.loginauthenticate(email.toString(),passsword.toString())){

                val login= Intent(this@MainActivity,RoleActivity::class.java)
                startActivity(login)
            }
            else{
                 if(email.toString().length!=0&&passsword.toString().length!=0)
                Toast.makeText(applicationContext,"e-mail or passsword is wrong",Toast.LENGTH_SHORT).show()
                else Toast.makeText(applicationContext,"e-mail or passsword cannot be empty",Toast.LENGTH_SHORT).show()
            }
        }
    }
    }

