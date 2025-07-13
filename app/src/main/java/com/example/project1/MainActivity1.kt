package com.example.project1

import android.os.Bundle
import android.widget.*
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity


class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
        val but=findViewById<Button>(R.id.cta)
        val name=findViewById<TextView>(R.id.name)
        but.setOnClickListener{
            startActivity(Intent(this,MainActivity2::class.java))
        }
    }
}