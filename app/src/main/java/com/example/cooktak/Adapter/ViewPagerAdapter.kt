package com.example.cooktak.Adapter

import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.cooktak.ui.Main.Barcode.BarcodeFragment
import com.example.cooktak.ui.Main.Community.CommunityFragment
import com.example.cooktak.ui.Main.SearchFragment

class ViewPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
    override fun getItem(p0: Int): Fragment? {
        return when (p0 % 3) {
            0 -> BarcodeFragment()
            1 -> SearchFragment()
            2 -> CommunityFragment()
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