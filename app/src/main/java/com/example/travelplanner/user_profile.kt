package com.example.travelplanner

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class user_profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_profile)

        //find the button and set click listner
        val btnOpenHome: ImageButton = findViewById(R.id.ib_home)
        btnOpenHome.setOnClickListener {
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)
        }

        val btnOpenStart: Button = findViewById(R.id.btn_logout)
        btnOpenStart.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Log Out Successfully!", Toast.LENGTH_SHORT).show()
        }

        val btnOpneHomeNav: ImageView = findViewById(R.id.nav_home)
        btnOpneHomeNav.setOnClickListener {
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)
        }
    }
}