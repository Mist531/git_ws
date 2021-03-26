package com.example.wordskills1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class launch4 : AppCompatActivity() {

    public var text1: TextView? = null
    public var text2: TextView? = null
    public var text3: TextView? = null
    public var text4: TextView? = null
    public var vector1: ImageView? = null
    public var vector2: ImageView? = null
    public var vector3: ImageView? = null
    public var vector4: ImageView? = null
    public var a: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch4)
        vector1 = findViewById(R.id.vector1)
        vector2 = findViewById(R.id.vector2)
        vector3 = findViewById(R.id.vector3)
        vector4 = findViewById(R.id.vector4)
        text1 = findViewById(R.id.text1)
        text2 = findViewById(R.id.text2)
        text3 = findViewById(R.id.text3)
        text4 = findViewById(R.id.text4)

    }
    @SuppressLint("ResourceAsColor")
    fun bottom1(view: View) {
            text1?.setTextColor(R.color.orange)
            val imageResource = vector1?.setImageResource(R.drawable.ic_vector1)
    }
    fun bottom2(view: View) {}
    fun bottom3(view: View) {}
    fun bottom4(view: View) {}

}