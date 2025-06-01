package com.example.travelplanner

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val btnOpenHome: Button = findViewById(R.id.btn_login)
        val emailInput: EditText = findViewById(R.id.user_name)
        val passwordInput: EditText = findViewById(R.id.user_password)

        btnOpenHome.setOnClickListener {
            val email = emailInput.text.toString().trim()
            val password = passwordInput.text.toString().trim()

            if (email == "abc@gmail.com" && password == "1222") {
                val intent = Intent(this, homepage::class.java)
                startActivity(intent)
                Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Invalid Email or Password!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
