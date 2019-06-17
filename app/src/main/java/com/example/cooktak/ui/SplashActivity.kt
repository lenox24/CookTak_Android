package com.example.cooktak.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.cooktak.R

class SplashActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.SplashTheme)
        super.onCreate(savedInstanceState)

        val intent = Intent(this, SignActivity::class.java)
        startActivity(intent)
        finish()
    }
}