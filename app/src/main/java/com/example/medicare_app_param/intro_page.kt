package com.example.medicare_app_param

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class intro_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_page)

        val aboutDoc=findViewById<TextView>(R.id.doctor_)
        aboutDoc.setOnClickListener{
            val intent= Intent(this,About_doctors::class.java)
            startActivity(intent)
        }

    }
}