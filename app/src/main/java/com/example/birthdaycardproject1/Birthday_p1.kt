package com.example.birthdaycardproject1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class Birthday_p1 : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_p1)

        val name = intent.getStringExtra(NAME_EXTRA)
       // birthdayGreeting.text = "Happy Birthday $name"
       findViewById<TextView>(R.id.birthdayGreeting).text = "Happy Birthday $name"





    }
}