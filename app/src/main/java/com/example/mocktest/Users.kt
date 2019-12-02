package com.example.mocktest

import android.app.Activity
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.users.*


import android.widget.TextView

import android.view.Gravity



import android.net.Uri
import com.google.android.material.snackbar.Snackbar


class Users : AppCompatActivity() {

    val toast: Toast? = null
    protected val REQUEST_PICK_IMAGE = 1

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.users)


        var count: Int = 0;

        var options1 = arrayOf("Template type", "Checkbox", "Fillup", "Radiotype")
        spinner.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options1)


        var choices = arrayOf("Enter the Choice", "2", "3", "4", "5")
        spinner5.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, choices)


        var marks = arrayOf("Enter the Mark", "1", "2")
        spinner6.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, marks)
        button4.setOnClickListener {

            count++;
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Confirmation")
            builder.setIcon(R.drawable.ic_checked)
            builder.setMessage("Are You Confirm ?")
            builder.setPositiveButton("Yes", { dialog: DialogInterface, which: Int ->
                val toast = Toast.makeText(
                    this@Users,
                    count.toString() + " - Question addedd successfully",
                    Toast.LENGTH_LONG
                )
                val v = toast?.view?.findViewById(android.R.id.message) as TextView
                v.setTextColor(Color.WHITE)
                v.setBackgroundColor(Color.RED)
                v.freezesText
                v.shadowColor
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast?.show()

            })
            builder.setNegativeButton("No", { dialog: DialogInterface?, which: Int -> finish() })
            builder.setNeutralButton("cancel", { dialog: DialogInterface?, which: Int -> finish() })
            builder.show()
        }
        button6.setOnClickListener {
            val login = Intent(this@Users, TestActivity::class.java)
            startActivity(login)
        }
//        imageView2.setOnClickListener {
//            val builder = AlertDialog.Builder(this)
//            builder.setTitle("")
//            builder.setIcon(R.drawable.ic_checked)
//            builder.setMessage("Do u Want to Add a Question")
//            builder.setPositiveButton("Yes", { dialog: DialogInterface , which: Int -> Toast.makeText(this@Users,"Make Your Question",Toast.LENGTH_LONG).show() })
//            builder.setNegativeButton("No",{ dialog: DialogInterface?, which: Int -> finish() })
//            builder.setNeutralButton("cancel",{ dialog: DialogInterface?, which: Int -> finish() })
//            builder.show()
////        }
        imageView2.setOnClickListener {
            val snackbar = Snackbar
                .make(root_layout, "Create New Question", Snackbar.LENGTH_LONG)
                snackbar.show()
        }
//
//        imageView2.setOnClickListener {
//
//
//            val pickImageIntent = Intent(
//                Intent.ACTION_PICK
//            )
//            pickImageIntent.type = "image/"
//            startActivityForResult(pickImageIntent, REQUEST_PICK_IMAGE);
//
//        }
//
//    }
//
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//
//        if(requestCode==REQUEST_PICK_IMAGE){
//            if(resultCode== Activity.RESULT_OK) {
//                val selectedImage: Uri? = data?.getData()
//
//                imageView2.setImageURI(selectedImage)
//
//            }
//
//        }
//    }
//
//    }
    }
}
