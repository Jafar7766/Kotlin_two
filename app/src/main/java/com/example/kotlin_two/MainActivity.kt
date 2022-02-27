package com.example.kotlin_two

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        val open_second = findViewById<Button>(R.id.open_second)
        open_second.setOnClickListener {
            openDetailActivity()
        }
    }

    private fun openDetailActivity() {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)

    }
}