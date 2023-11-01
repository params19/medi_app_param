package com.example.medicare_app_param

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Sign_in_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_page)

        val signIn = findViewById<TextView>(R.id.button)
        signIn.setOnClickListener {
            val intent = Intent(this, intro_page::class.java)
            startActivity(intent)
        }

    }
}