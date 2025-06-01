package com.example.travelplanner

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class srilanka_details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_srilanka_details)

        //find the button and set click listner
        val btnOpenhomepage: Button = findViewById(R.id.btn_save)
        btnOpenhomepage.setOnClickListener {
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)
        }

        val imagebOpenHomePage: ImageButton =findViewById(R.id.backbtn)
        imagebOpenHomePage.setOnClickListener { val intent = Intent(this, homepage::class.java)
        startActivity(intent)
        }
    }
}

