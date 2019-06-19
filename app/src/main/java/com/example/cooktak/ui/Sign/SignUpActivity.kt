package com.example.cooktak.ui.Sign

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.example.cooktak.R
import com.example.cooktak.connecter.Connector
import com.example.cooktak.model.registerModel
import com.google.gson.JsonObject
import kotlinx.android.synthetic.main.activity_sign_up.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        btn_check_register.setOnClickListener {
            if (edt_email_register.text.isNotEmpty() && edt_pwd_register.text.isNotEmpty() && edt_conPwd_register.text.isNotEmpty()
                && edt_nick_register.text.isNotEmpty() && edt_age_register.text.isNotEmpty() && radio_group_register.checkedRadioButtonId != null
            ) {

                if (edt_pwd_register.text.toString() == edt_conPwd_register.text.toString()) {
                    val obj = JsonObject()
                    obj.addProperty("email", edt_email_register.text.toString())
                    obj.addProperty("pwd", edt_pwd_register.text.toString())
                    obj.addProperty("nick", edt_nick_register.text.toString())
                    obj.addProperty("age", edt_age_register.text.toString().toInt())
                    when (radio_group_register.checkedRadioButtonId) {
                        R.id.radio_btn_man -> obj.addProperty("gender", 1)
                        R.id.radio_btn_woman -> obj.addProperty("gender", 2)
                        R.id.radio_btn_unknown -> obj.addProperty("gender", 3)
                    }

                    Connector.createApi().registerUser(obj).enqueue(object : Callback<Void> {
                        override fun onResponse(call: Call<Void>, response: Response<Void>) {
                            when (response.code()) {
                                200 -> {
                                    Toast.makeText(this@SignUpActivity, "회원가입 성공", Toast.LENGTH_SHORT).show()
                                    startActivity(Intent(this@SignUpActivity, SignInActivity::class.java))
                                }
                                else -> Toast.makeText(this@SignUpActivity, "회원가입 실패", Toast.LENGTH_SHORT).show()
                            }
                        }

                        override fun onFailure(call: Call<Void>, t: Throwable) {
                            Toast.makeText(this@SignUpActivity, "회원가입 실패", Toast.LENGTH_SHORT).show()
                        }
                    })

                } else {
                    Toast.makeText(this@SignUpActivity, "비밀번호가 서로 다릅니다.", Toast.LENGTH_SHORT).show()
                }

            } else {
                Toast.makeText(this@SignUpActivity, "빈칸이 존재합니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
