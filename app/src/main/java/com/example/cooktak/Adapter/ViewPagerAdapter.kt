package com.example.cooktak.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.view.ViewGroup
import com.example.cooktak.ui.Main.SearchFragment
import com.example.cooktak.ui.Main.RecommendFragment
import com.example.cooktak.ui.Main.PostsFragment

class ViewPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
    override fun getItem(p0: Int): Fragment? {
        return when (p0 % 3) {
            0 -> SearchFragment()
            1 -> RecommendFragment()
            2 -> PostsFragment()
            else -> null
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        super.destroyItem(container, position, `object`)
    }

}