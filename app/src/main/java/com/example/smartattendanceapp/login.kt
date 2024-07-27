package com.example.smartattendanceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val textview=findViewById<TextView>(R.id.adminlogin)
        textview.setOnClickListener{
            val myintent = Intent(this, adminlogin::class.java)
            startActivity(myintent)}
        val textview1=findViewById<TextView>(R.id.newuser)
            textview1.setOnClickListener{
                val myintent = Intent(this, signup::class.java)
                startActivity(myintent)

            
        }
    }
}