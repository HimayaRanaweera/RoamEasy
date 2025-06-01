package com.example.travelplanner

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class onboard_screen_two : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard_screen_two)

        //find the button and set click listner
        val btnOpenSignUp: Button = findViewById(R.id.btn_signup)
        btnOpenSignUp.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }

        val btnOpenlogin: TextView = findViewById(R.id.tv_login)
        btnOpenlogin.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
    }
}