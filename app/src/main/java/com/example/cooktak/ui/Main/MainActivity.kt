package com.example.cooktak.ui.Main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.cooktak.Adapter.ViewPagerAdapter
import com.example.cooktak.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        view_pager_main.adapter = ViewPagerAdapter(supportFragmentManager)
        tab_layout_main.setupWithViewPager(view_pager_main)
    }
}
