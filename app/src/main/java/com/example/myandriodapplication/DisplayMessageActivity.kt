package com.example.myandriodapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message2)
        val message = intent.getStringExtra(MESSAGE_ID)
        val textView = findViewById<TextView>(R.id.message_tv)
        textView.text = message
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
    }
}