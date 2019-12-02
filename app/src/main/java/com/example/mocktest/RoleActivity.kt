package com.example.mocktest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.GridLayout
import androidx.appcompat.widget.TooltipCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_role.*

class RoleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_role)

        val mLayoutManager = GridLayoutManager(this,2,LinearLayoutManager.VERTICAL,false)
        gridlist.layoutManager=mLayoutManager as GridLayoutManager
        gridlist.adapter=RVcustomAdapter(applicationContext,GridContentList.datas){ position->

            when(position) {
                0 -> {

                    startActivity(Intent(this@RoleActivity, Registration::class.java))

                }


                1 -> {

                startActivity(Intent(this@RoleActivity, TestActivity::class.java))

            }

               2-> {
                   startActivity(Intent(this@RoleActivity, ManageUsers::class.java))

               }
            }

        }

        };

    }

