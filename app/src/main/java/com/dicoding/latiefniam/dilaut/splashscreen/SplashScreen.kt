package com.dicoding.latiefniam.dilaut.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper

import androidx.appcompat.app.AppCompatActivity
import com.dicoding.latiefniam.dilaut.databinding.ActivitySplashScreenBinding

import com.dicoding.latiefniam.dilaut.main.MainActivity



class SplashScreen : AppCompatActivity() {
    private lateinit var handler : Handler
    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        handler= Handler(Looper.getMainLooper())
        handler.postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        },3500)
    }
}