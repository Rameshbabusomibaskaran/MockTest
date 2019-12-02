package com.example.mocktest

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.test.*
import android.widget.*
import java.util.*

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test)


        var options = arrayOf("Choose Section", "Logical", "Technical", "Analytical")
        spinner4.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options)

        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        date.setOnClickListener {
            val dpd = DatePickerDialog(
                this,
                DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                    // Display Selected date in TextView
                    date.setText("" + dayOfMonth + "-" + (monthOfYear+1) + "-" + year)
                },
                year,
                month,
                day
            )
            dpd.show()
        }

        button5.setOnClickListener {
            val users= Intent(this@TestActivity,TestSettings::class.java)
            startActivity(users)
        }
    }
}