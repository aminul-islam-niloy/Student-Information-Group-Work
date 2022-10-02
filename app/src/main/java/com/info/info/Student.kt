package com.info.info

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlin.random.Random

class Student : AppCompatActivity() {

    private val name = arrayListOf("Jency", "Name", "Mou", "Bithi", "Jannat")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        val input = intent.getStringExtra("USER")

        val textView = findViewById<TextView>(R.id.View1)
        val sms = " $input , You have an chance to win a git. You have to Buy a ticket by adding your name on Ticket"

        textView.text = sms

        val output = findViewById<TextView>(R.id.outBtn)
        val buy = findViewById<Button>(R.id.buyBtn)
        val addName = findViewById<EditText>(R.id.addname)
        val draw = findViewById<Button>(R.id.drawbtn)


        draw.setOnClickListener {
            val random = Random.Default
            val randomName = random.nextInt(name.count())

            val message = "${name[randomName]}, You have own ! Clilck gift icon to get gift"
            output.text = message
        }

        buy.setOnClickListener {
            val names = addName.text.toString()

            if (names == "") {
                Toast.makeText(this@Student, "You Must have to Enter your name", Toast.LENGTH_SHORT)
                    .show()
            } else {
                name.add(names)
                addName.text.clear()

            }

        }
    }
}