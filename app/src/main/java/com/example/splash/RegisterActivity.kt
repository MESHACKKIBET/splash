package com.example.splash

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var btn_login = findViewById<Button>(R.id.btn_login)
        var btn_register = findViewById<Button>(R.id.btn_register)

        btn_login.setOnClickListener {
           val nxt = Intent(this, LoginActivity::class.java)
            startActivity(nxt)
        }
    }
}