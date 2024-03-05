package com.example.laboration1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.ImageView
import android.widget.TextView


class SignedInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signed_in)

        //Getting textview id and changing the text to the message from putExtra in SignInActivity
        val signedInGreeting: TextView = findViewById(R.id.tv_signedingreeting)
        signedInGreeting.text = intent.getStringExtra("message")
    }
}