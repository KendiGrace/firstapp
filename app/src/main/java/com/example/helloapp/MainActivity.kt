package com.example.helloapp

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn1=findViewById<Button>(R.id.btn1)
        var tvName=findViewById<TextView>(R.id.tvName)
        var imgBlog=findViewById<ImageView>(R.id.imgblog)


        btn1.setOnClickListener {
            var intent=Intent(baseContext,Story1::class.java)
            startActivity(intent)

        }

    }
}