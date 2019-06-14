package com.example.cooktak.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.cooktak.R
import com.example.cooktak.ui.Main.MainActivity

class SplashActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.SplashTheme)
        super.onCreate(savedInstanceState)

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}