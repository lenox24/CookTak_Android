package com.example.cooktak.ui.Splash

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.cooktak.R
import com.example.cooktak.ui.Main.MainActivity
import com.example.cooktak.ui.Sign.SelectSignActivity
import com.example.cooktak.ui.Sign.SignInActivity
import com.example.cooktak.ui.Sign.SignUpActivity
import kotlinx.android.synthetic.main.activity_touch.*

class TouchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_touch)

        layout_touch.setOnTouchListener { v, _ ->
            startActivity(Intent(this@TouchActivity, MainActivity::class.java))
            finish()
            true
        }

        btn_register.setOnClickListener {
            startActivity(Intent(this@TouchActivity, SelectSignActivity::class.java))
        }
    }
}
