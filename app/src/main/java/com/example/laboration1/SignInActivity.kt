package com.example.laboration1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        //The correct username and password to log in
        val userArray = listOf<Pair<String, String>>(
            "username1" to "password1"
        )

        val userName: EditText = findViewById(R.id.et_username)
        val passWord: EditText = findViewById(R.id.password)
        val btnSignIn: Button = findViewById(R.id.btn_signinpage)


        //Method that checks if user input is correct and the go to the Signed In page
        btnSignIn.setOnClickListener {
            val userNameInput = userName.text.toString()
            val passWordInput = passWord.text.toString()

            //Looking if username and password match
            val user = userArray.find { it.first == userNameInput && it.second == passWordInput }
            if (user != null) {

                val myIntent = Intent(this, SignedInActivity::class.java).apply {
                    putExtra("message","Welcome $userNameInput")
                }
                startActivity(myIntent)
            } else {

                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
            }

        }

    }
}