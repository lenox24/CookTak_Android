package com.example.cooktak.ui.Sign

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.example.cooktak.R
import kotlinx.android.synthetic.main.activity_select_sign.*

class SelectSignActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_sign)

        btn_ani_main1.startAnimation(AnimationUtils.loadAnimation(this, R.anim.anime_trans_splash))
        orange1.startAnimation(AnimationUtils.loadAnimation(this, R.anim.anime_trans_up))
        orange2.startAnimation(AnimationUtils.loadAnimation(this, R.anim.anime_trans_down))
        linear_btn.startAnimation(AnimationUtils.loadAnimation(this, R.anim.anime_alpha_logo))

        btn_ani_main1.setOnClickListener {
            orange1.startAnimation(AnimationUtils.loadAnimation(this, R.anim.anime_trans_up))
            orange2.startAnimation(AnimationUtils.loadAnimation(this, R.anim.anime_trans_down))
        }

        btn_register_login.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        btn_login_login.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}
