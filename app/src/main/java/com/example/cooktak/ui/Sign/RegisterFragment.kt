package com.example.cooktak.ui.Sign

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.cooktak.R
import com.example.cooktak.ui.Main.MainActivity
import kotlinx.android.synthetic.main.fragment_register.view.*

class RegisterFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_register, container, false)

        view.btn_check_register.setOnClickListener {
            startActivity(Intent(view.context, MainActivity::class.java))
        }

        return view
    }
}
