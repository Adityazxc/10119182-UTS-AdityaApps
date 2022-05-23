package com.example.a10119182_uts_adityaapps.onboarding

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.lifecycle.Lifecycle


//        21 Mei 2022
//        10119182
//        Aditya Firmansayah
//        IF-5
class ViewPagerAdapter(
    list: ArrayList<Fragment>,
    fm: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fm, lifecycle){
    private val fragmentList=list

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }

}
