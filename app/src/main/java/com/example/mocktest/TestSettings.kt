package com.example.mocktest

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CompoundButton
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_test.*

import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.users.*


class TestSettings: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        switch3.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->

         if(isChecked){

           calldialog()
           }
     })
        switch2.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){

                textView5.setVisibility(View.VISIBLE)
                radio.setVisibility(View.VISIBLE)
            }
            else {radio.setVisibility(View.GONE)
            textView5.setVisibility(View.GONE)}
        })
        button7.setOnClickListener {


            val users= Intent(this@TestSettings,Users::class.java)
            startActivity(users)
        }
    }
    fun calldialog(){

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Flag Colors")
        builder.setView(R.layout.customdialoglayout)
//        builder.setMessage("Do u want to delete ?")
        builder.setPositiveButton("Yes", { dialog: DialogInterface?, which: Int ->
            val snackbar = Snackbar
                .make(testlayout, "Flag Settings Saved Successfully", Snackbar.LENGTH_LONG)
            snackbar.show()
        })
        builder.setNegativeButton("No",{dialog: DialogInterface?, which: Int ->
            switch3.isChecked=false
        })
        builder.setNeutralButton("cancel",{ dialog: DialogInterface?, which: Int -> finish() })
        builder.show()
    }
}
