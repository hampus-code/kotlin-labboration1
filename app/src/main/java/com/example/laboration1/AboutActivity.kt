package com.example.laboration1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)


        val btnNavigateToMain: Button = findViewById(R.id.btn_goback)
        val btnNavigateToSignIn: Button = findViewById(R.id.btn_sign_in)

        //Method to go back to the Main page
        btnNavigateToMain.setOnClickListener {
            val myIntent = Intent(this, MainActivity::class.java).apply {
            }
            startActivity(myIntent)
        }

        //Method to go to the Sign In page
        btnNavigateToSignIn.setOnClickListener {
            val myIntent = Intent(this, SignInActivity::class.java).apply {
            }
            startActivity(myIntent)
        }
    }
}
