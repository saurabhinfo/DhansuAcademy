package com.dhansuacademy.dashboardModule

import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible
import com.dhansuacademy.R

class Login : AppCompatActivity() {

    lateinit var btnLogIn:Button
    lateinit var etPhonenumer: EditText
    lateinit var etEmail:EditText
    lateinit var txtSignUp:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        btnLogIn = findViewById(R.id.btnLogIn)
        etPhonenumer = findViewById(R.id.etPhonenumer)
        etEmail = findViewById(R.id.etEmail)
        txtSignUp = findViewById(R.id.txtSignUp)


        txtSignUp.setOnClickListener {

            if (etPhonenumer.visibility == View.VISIBLE)
            {
                etPhonenumer.visibility = View.GONE
                etEmail.visibility = View.VISIBLE

            }else
            {
                etPhonenumer.visibility = View.VISIBLE
                etEmail.visibility = View.GONE
            }

        }

        btnLogIn.setOnClickListener {
            val intent = Intent(this, OTPScreen::class.java)
            startActivity(intent)
            finish()
        }

    }
}