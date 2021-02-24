package com.dhansuacademy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.dhansuacademy.HomeModule.Home_Fragement_1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       loadFragement(Home_Fragement_1())
    }




    //For load different Fragment
    private fun loadFragement(fragment:Fragment)
    {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, fragment)
                    .commitAllowingStateLoss()

    }
}