package com.example.laboration1

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.laboration1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNavigateToAbout: Button = findViewById(R.id.main_button)
        val btnNavigateToSignIn: Button = findViewById(R.id.btn_signiin)


        //Method to go to the About page
        btnNavigateToAbout.setOnClickListener {
            val myIntent = Intent(this, AboutActivity::class.java).apply {
            }
            startActivity(myIntent)
        }

        //Method to go to the Sign in page
        btnNavigateToSignIn.setOnClickListener {
            val myIntent = Intent(this, SignInActivity::class.java).apply {
            }
            startActivity(myIntent)
        }
    }
}