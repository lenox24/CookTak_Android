package com.example.cooktak.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.view.ViewGroup
import com.example.cooktak.ui.Main.Main1Fragment
import com.example.cooktak.ui.Main.Main2Fragment
import com.example.cooktak.ui.Main.Main3Fragment

val fragmentList = arrayListOf("1", "2", "3")

class ViewPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
    override fun getItem(p0: Int): Fragment? {
        return when (p0 % 3) {
            0 -> Main1Fragment()
            1 -> Main2Fragment()
            2 -> Main3Fragment()
            else -> null
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        super.destroyItem(container, position, `object`)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentList[position]
    }
}