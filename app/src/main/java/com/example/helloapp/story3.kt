package com.example.helloapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class story3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story3)

        var chap3 = findViewById<TextView>(R.id.chap3)
        var tv3a = findViewById<TextView>(R.id.tv3A)
        var tv3B = findViewById<TextView>(R.id.tv3B)
        var tv3C = findViewById<TextView>(R.id.tv3C)

        var btn6 = findViewById<Button>(R.id.btn6)
        var btn7 = findViewById<Button>(R.id.btn7)

        btn6.setOnClickListener {
            var intent = Intent(baseContext, story2::class.java)
            startActivity(intent)
        }
        btn7.setOnClickListener {
            var intent = Intent(baseContext, story4::class.java)
            startActivity(intent)
        }
    }
}