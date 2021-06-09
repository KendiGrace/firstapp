package com.example.helloapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class story4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story4)

        var chap4 = findViewById<TextView>(R.id.chap4)
        var tv4A = findViewById<TextView>(R.id.tv4A)
        var tv4B = findViewById<TextView>(R.id.tv4B)
        var tv4C = findViewById<TextView>(R.id.tv4C)

        var btn8 = findViewById<Button>(R.id.btn8)
        var btn9 = findViewById<Button>(R.id.btn9)

        btn8.setOnClickListener {
            var intent = Intent(baseContext, story3::class.java)
            startActivity(intent)
        }
        btn9.setOnClickListener {
            var intent = Intent(baseContext, story5::class.java)
            startActivity(intent)
        }
    }
}