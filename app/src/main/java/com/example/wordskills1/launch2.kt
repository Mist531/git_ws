package com.example.wordskills1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.Validators.and
import android.view.View
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import com.google.gson.Gson
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import java.io.IOException

class launch2 : AppCompatActivity() {
    private var email : EditText? = null
    private var password: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch2)
        email = findViewById(R.id.Email)
        password = findViewById(R.id.Password)
    }

    public fun VoitiOn(view: View) {
        if ((email?.text?.length != 0) and (password?.text?.length != 0)){
            if (email?.text.toString().isEmailValid()){
                val intent = Intent(this, launch4::class.java)
                startActivity(intent)
                //login1()
            }
            else{
                email?.error = "Введите коректный Email"
            }

        }
        else{
            if (email?.text?.length == 0) {email?.error = "Заполните поле"}
            if (password?.text?.length == 0) {password?.error = "Заполните поле"}
        }

    }

    fun Register1(view: View) {
        val intent = Intent(this, launch3::class.java)
        startActivity(intent)
    }
    private fun String.isEmailValid(): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(this).matches()


    }
    @Override
    private fun login1(){
        val client = OkHttpClient()
        val gson = Gson()
        val email1 = findViewById<EditText>(R.id.Email).text
        val requestBody = RequestBody.create("application/json; charset=utf-8".toMediaTypeOrNull(),
                    "{\"email1\":\"$email1\"}")
        val request = Request.Builder()
            .url("http://cinema.areas.su/auth/login")
            .post(requestBody)
            .build()
        client.newCall(request).enqueue(object : Callback {

            override fun onFailure(call: Call, e: IOException) {

            }

            override fun onResponse(call: Call, response: Response) {
                var result : String = response.toString()
                if (response.code == 200) {runOnUiThread {

                    val responseBody = response.body?.string()
                    val loginUser : Login_GET = gson.fromJson(responseBody, Login_GET::class.java)
                    var token = loginUser.token

                    val intent = Intent(this@launch2, launch3::class.java)
                    startActivity(intent)
                    finish()
                }}
                else if (response.code == 400) { runOnUiThread{
                }}
            }
        })


    }

}


