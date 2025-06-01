package com.example.travelplanner

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class onboardScreen_one : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard_screen_one)

        //find the button and set click listner
        val btnOpenOnboardTwo: Button = findViewById(R.id.btn_next)
        btnOpenOnboardTwo.setOnClickListener {
            val intent = Intent(this, onboard_screen_two::class.java)
            startActivity(intent)
        }
    }
}
