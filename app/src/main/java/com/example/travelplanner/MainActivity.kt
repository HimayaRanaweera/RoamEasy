package com.example.travelplanner

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.travelplanner.R.id.launchbtn

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //find the button and set click listner
        val btnOpenOnboardOne:ImageButton = findViewById(R.id.launchbtn)
        btnOpenOnboardOne.setOnClickListener { val intent = Intent(this, onboardScreen_one::class.java)
        startActivity(intent)
        }
    }
}