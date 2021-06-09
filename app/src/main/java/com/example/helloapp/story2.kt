package com.example.helloapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class story2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story2)
        var chap2 = findViewById<TextView>(R.id.chap2)
        var tv2A = findViewById<TextView>(R.id.tv2A)
        var tv2B = findViewById<TextView>(R.id.tv2B)
        var tv2C = findViewById<TextView>(R.id.tv2C)

        var btn4 = findViewById<Button>(R.id.btn4)
        var btn5 = findViewById<Button>(R.id.btn5)

        btn4.setOnClickListener {
            var intent = Intent(baseContext, Story1::class.java)
            startActivity(intent)
        }
        btn5.setOnClickListener {
            var intent = Intent(baseContext, story3::class.java)
            startActivity(intent)
        }
    }
}