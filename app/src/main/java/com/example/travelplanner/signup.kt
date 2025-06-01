package com.example.travelplanner

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)

        val btnSignUp: Button = findViewById(R.id.btn_signUp)
        val nameInput: EditText = findViewById(R.id.editTextText)
        val emailInput: EditText = findViewById(R.id.editTextTextEmailAddress)
        val passwordInput: EditText = findViewById(R.id.editTextTextPassword)
        val confirmPasswordInput: EditText = findViewById(R.id.editTextTextPassword2)
        val checkBox: CheckBox = findViewById(R.id.checkBox)

        btnSignUp.setOnClickListener {
            val name = nameInput.text.toString().trim()
            val email = emailInput.text.toString().trim()
            val password = passwordInput.text.toString().trim()
            val confirmPassword = confirmPasswordInput.text.toString().trim()

            if (name == "Himaya Ranaweera" && email == "abc@gmail.com" && password == "1222") {
                if (password == confirmPassword) {
                    if (checkBox.isChecked) {
                        val intent = Intent(this, login::class.java)
                        startActivity(intent)
                        Toast.makeText(this, "Signup Successful!", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(this, "Please agree to Remember Me!", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(this, "Passwords do not match!", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Invalid Name, Email, or Password!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
