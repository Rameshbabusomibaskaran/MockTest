package com.example.mocktest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_registration.*
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.widget.EditText


class Registration : AppCompatActivity(),AdapterView.OnItemSelectedListener {

    var rolevalue:EditText?=null
    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

        val item = parent?.getItemAtPosition(position).toString()
        editText8.setText(item)
        editText8.visibility = View.INVISIBLE
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)


        var options=arrayOf("Please enter a role","Admin","TestConductor")
        spinner2.adapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)

        val register=button2
        spinner2.setOnItemSelectedListener(this);
        register.setOnClickListener {


        val name=name.text
        val email=editText5.text
        val password=editText6.text
        val confirmpassword=editText7.text
        val role=editText8.text



        ManageUserList.data.add(ManageUser(name.toString(),role.toString(),R.drawable.ic_woman,R.drawable.ic_delete))

        if (Authentication.registerdatahandlig(name.toString(),email.toString(),password.toString(),confirmpassword.toString(),role.toString()))
           {

               Toast.makeText(applicationContext,"Registeredsuccessfully",Toast.LENGTH_SHORT).show()
           }
        else{
            if(email.toString().length!=0&&password.toString().length!=0&&name.toString().length!=0&&confirmpassword.toString().length!=0)
                Toast.makeText(applicationContext,"check password",Toast.LENGTH_SHORT).show()
            else Toast.makeText(applicationContext,"Fill all content ",Toast.LENGTH_SHORT).show()
        }
    }



    }
}
