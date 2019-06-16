package com.example.cooktak.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.example.cooktak.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        orange1.startAnimation(AnimationUtils.loadAnimation(this, R.anim.anime_set_up))
        orange2.startAnimation(AnimationUtils.loadAnimation(this, R.anim.anime_set_down))

        btn_ani_main1.setOnClickListener {
            orange1.startAnimation(AnimationUtils.loadAnimation(this, R.anim.anime_set_up))
            orange2.startAnimation(AnimationUtils.loadAnimation(this, R.anim.anime_set_down))
        }
    }
}
