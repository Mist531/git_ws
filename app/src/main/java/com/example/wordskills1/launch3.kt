package com.example.wordskills1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class launch3 : AppCompatActivity() {
    public var Name: EditText? = null
    public var LastName: EditText? = null
    public var Email1: EditText? = null
    public var  Password: EditText? = null
    public var Password1: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch3)
        Name = findViewById(R.id.Name)
        Password = findViewById(R.id.Password)
        Password1 = findViewById(R.id.Password1)
        LastName = findViewById(R.id.LastName)
        Email1 = findViewById(R.id.Email1)

    }

    fun VoitiOn1(view: View) {
        if ((Name?.text?.length != 0) and (LastName?.text?.length != 0) and (Email1?.text?.length != 0) and (Password?.text?.length != 0) and (Password1?.text?.length != 0)){
            if (Email1?.text.toString().isEmailValid()){
                if (Password?.text?.length!! >= 8) {
                    if (Password?.text.toString() == Password1?.text.toString()) {
                        val intent1 = Intent(this, launch4::class.java)
                        startActivity(intent1)
                    } else {
                        Password?.error = "Введите одинаковые пароли"
                    }
                }
                else{
                    Password?.error ="Пароль должен содержать минимум 8 символов"
                }
            }
            else{
                Email1?.error = "Введите коректный Email"
                if (Password?.text?.length!! >= 8) {
                    if (Password?.text.toString() == Password1?.text.toString()) {
                        val intent1 = Intent(this, launch4::class.java)
                        startActivity(intent1)
                    } else {
                        Password?.error = "Введите одинаковые пароли"
                    }
                }
                else{
                    Password?.error ="Пароль должен содержать минимум 8 символов"
                }

            }

        }
        else{
            if (Password?.text?.length == 0) {Password?.error = "Заполните поле"}
            if (Password1?.text?.length == 0) {Password1?.error = "Заполните поле"}
            if (LastName?.text?.length == 0) {LastName?.error = "Заполните поле"}
            if (Name?.text?.length == 0) {Name?.error = "Заполните поле"}
            if (Email1?.text?.length == 0) {Email1?.error = "Заполните поле"}
        }
    }
    fun EstAkk(view: View) {
        val intent2 = Intent(this, launch2::class.java)
        startActivity(intent2)
    }
    private fun String.isEmailValid(): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(this).matches()
    }

}