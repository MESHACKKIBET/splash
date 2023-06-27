package com.example.splash

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var btn_webpage = findViewById<Button>(R.id.btn_webpage)
        btn_webpage.setOnClickListener {
            val toweb =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://fmovies.wtf/home?ref=cybrhome"))
            startActivity(toweb)// }
        }
    }
}