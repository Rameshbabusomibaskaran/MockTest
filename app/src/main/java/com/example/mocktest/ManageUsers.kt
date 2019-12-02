package com.example.mocktest

import android.app.Activity
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_users.*


class ManageUsers : AppCompatActivity() {

    val  REQUEST_PICK_IMAGE:Int=1;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manage_users)
        val toast:Toast?=null


        val manager=MangaeCustomAdapter(applicationContext,ManageUserList.data){position,data->

            when(data){

                "delete"->{

                    val builder = AlertDialog.Builder(this)
                    builder.setTitle("Confirmation")
                    builder.setIcon(R.drawable.ic_checked)
                    builder.setMessage("Do u want to delete ?")
                    builder.setPositiveButton("Yes", { dialog: DialogInterface?, which: Int -> ManageUserList.data.removeAt(position)
                        finish();
                        overridePendingTransition(0, 0);
                        startActivity(getIntent());
                        overridePendingTransition(0, 0);
                    })
                    builder.setNegativeButton("No",null)
                    builder.setNeutralButton("cancel",{ dialog: DialogInterface?, which: Int -> finish() })
                    builder.show()
                }
                "ChangeImage"->{


                    val pickImageIntent = Intent(
                Intent.ACTION_PICK
            )
            pickImageIntent.type = "image/"
            startActivityForResult(pickImageIntent, REQUEST_PICK_IMAGE);


                }
            }
        }
        val manage=findViewById(R.id.manageusers) as ListView
        manage.adapter=manager
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode==REQUEST_PICK_IMAGE){
            if(resultCode== Activity.RESULT_OK) {
                val selectedImage: Uri? = data?.getData()
                    imageView8.setImageURI(selectedImage)

            }

        }
    }
}
