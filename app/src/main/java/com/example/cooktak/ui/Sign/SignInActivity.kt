package com.example.cooktak.ui.Sign

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.cooktak.R
import com.example.cooktak.ui.Main.MainActivity
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        button.setOnClickListener {
            startActivity(Intent(this@SignInActivity, MainActivity::class.java))
            finish()
        }
    }
}
