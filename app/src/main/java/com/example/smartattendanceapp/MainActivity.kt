package com.example.smartattendanceapp
import android.content.Intent
import android.os.Bundle

import android.os.Handler

import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        Handler().postDelayed({
                              val intent = Intent (this@MainActivity, login::class.java)
                              startActivity(intent)
        },1000)
        }
    }
