package com.dhansuacademy.dashboardModule

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.dhansuacademy.HomeModule.SelectCategoryParent
import com.dhansuacademy.MainActivity
import com.dhansuacademy.R

class OTPScreen : AppCompatActivity() {

    lateinit var back_button:ImageButton
    lateinit var btnVerifyOTP:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp_verification)

        back_button = findViewById(R.id.back_button)
        btnVerifyOTP = findViewById(R.id.btnVerifyOTP)

        btnVerifyOTP.setOnClickListener {
            val intent = Intent(this, SelectCategoryParent::class.java)
            startActivity(intent)
            finish()
        }

        back_button.setOnClickListener {

            finish()
        }

    }
}