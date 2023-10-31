package com.example.medicare_app_param

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.math.sign

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signIn=findViewById<TextView>(R.id.textView8)
        signIn.setOnClickListener{
            val intent= Intent(this,Sign_in_page::class.java)
            startActivity(intent)
        }
    }
}