package com.example.travelplanner

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homepage)

        //find the button and set click listner
        val btnOpenSL: ImageButton = findViewById(R.id.imageButtonsrilanka)
        btnOpenSL.setOnClickListener {
            val intent = Intent(this, srilanka_details::class.java)
            startActivity(intent)
        }

        val openUser : ImageView = findViewById(R.id.nav_user)
        openUser.setOnClickListener {
            val intent = Intent(this, user_profile::class.java)
            startActivity(intent)
        }
    }
}
