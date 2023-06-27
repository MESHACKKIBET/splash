package com.example.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var btn_login = findViewById<Button>(R.id.btn_login)
        var btn_register = findViewById<Button>(R.id.btn_register)

        btn_login.setOnClickListener {
            val nxt = Intent(this, RegisterActivity::class.java)
            startActivity(nxt)

            var btn_login = findViewById<Button>(R.id.btn_login)
            var btn_home = findViewById<Button>(R.id.btn_home)

            btn_login.setOnClickListener {
                val nxt = Intent(this, HomeActivity::class.java)
                startActivity(nxt)
            }
        }
    }
}