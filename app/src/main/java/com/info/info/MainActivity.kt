package com.info.info

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input1 = findViewById<EditText>(R.id.input1)
        val submitBtn = findViewById<Button>(R.id.submitBtn)
        val output = findViewById<TextView>(R.id.TopText2)
        val next= findViewById<Button>(R.id.nextBtn)

        var enterText=""

        submitBtn.setOnClickListener {

             enterText = input1.text.toString()

            if (enterText == "") {
                Toast.makeText(this@MainActivity, "Input can't be blank ", Toast.LENGTH_LONG).show()
            }
            else {
                val message = " Hello $enterText"
                output.text = message


            }


        }

        next.setOnClickListener {
             val intent = Intent(this@MainActivity,Student::class.java)
            intent.putExtra("USER",enterText)
            startActivity(intent)

        }


    }
}