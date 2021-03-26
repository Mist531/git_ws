package com.example.wordskills1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout

class launch1 : AppCompatActivity() {
    public var Start1 : LinearLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch1)
        Start1 = findViewById(R.id.Start1)
    }

    public fun Start1(view: View) {
        val intent = Intent(this, launch2::class.java)
        startActivity(intent)
    }
}