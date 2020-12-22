package com.example.birthdaycardproject1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.birthdaycardproject1.Birthday_p1.Companion.NAME_EXTRA
import com.example.birthdaycardproject1.R.id.*
import com.example.birthdaycardproject1.R.id.nameInput as birthdaycardproject1RIdNameInput

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    fun createBirthdayCard(view: View) {
    //    val name = nameInput.editableText.tostring()       //to make dialogue visible.
      val nameInput: EditText =findViewById(R.id.nameInput)
        val name = nameInput.text.toString()                   //to make dialogue visible.
        Toast.makeText(this,"$name Your Request for Birthday Card Is In Process",Toast.LENGTH_LONG).show()
       //
       // val name = nameInput.editableText.toString()
        val intent = Intent(this, Birthday_p1::class.java )
        intent.putExtra(NAME_EXTRA,name)

        startActivity(intent)


    }
}