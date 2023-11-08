package com.example.myfirstapp2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainActivity : AppCompatActivity() {
    //Declare variable
    private lateinit var btnStart: Button



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Initialization using ID
        val btnStart: Button = findViewById<Button>(R.id.btnStart)
        val firstNameEditText: EditText = findViewById<EditText>(R.id.firstNameEditText)
        val lastNameEditText: EditText = findViewById<EditText>(R.id.lastNameEditText)

        btnStart.setOnClickListener {
            val firstName = firstNameEditText.text.toString()
            val lastName = lastNameEditText.text.toString()

            val intent = Intent(this, ListExrecices::class.java)
            intent.putExtra("first_name", firstName)
            intent.putExtra("last_name", lastName)

            startActivity(intent)
        }

    }
}