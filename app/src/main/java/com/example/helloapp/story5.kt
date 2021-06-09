package com.example.helloapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class story5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story5)

        var chap5 = findViewById<TextView>(R.id.chap5)
        var tv5A = findViewById<TextView>(R.id.tv5A)
        var tv5B = findViewById<TextView>(R.id.tv5B)
        var tv5C = findViewById<TextView>(R.id.tv5C)

        var btn10 = findViewById<Button>(R.id.btn10)


        btn10.setOnClickListener {
            var intent = Intent(baseContext, story4::class.java)
            startActivity(intent)
        }

    }
}