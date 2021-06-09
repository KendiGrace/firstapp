package com.example.helloapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Story1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story1)

        var chap1 = findViewById<TextView>(R.id.chap1)
        var tv1A = findViewById<TextView>(R.id.tv1A)
        var tv1B = findViewById<TextView>(R.id.TV1B)
        var tv1C = findViewById<TextView>(R.id.TV1C)

        var btn2 = findViewById<Button>(R.id.btn2)
        var btn3 = findViewById<Button>(R.id.btn3)

        btn2.setOnClickListener {
            var intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
        }
        btn3.setOnClickListener {
            var intent = Intent(baseContext, story2::class.java)
            startActivity(intent)
        }
    }
}