package com.dedijogja.whatsappstickerkotlin.view

import android.annotation.SuppressLint
import android.app.Application
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.dedijogja.whatsappstickerkotlin.databinding.ActivitySplashBinding
import com.dedijogja.whatsappstickerkotlin.repo.Api
import com.dedijogja.whatsappstickerkotlin.utils.Constant

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

       openMainActivity()

    }

    private fun openMainActivity(){
        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }

    override fun onBackPressed() {
        //override onbackpressed agar user tidak dapat menutup splash screen
    }
}