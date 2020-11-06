package com.example.fragment_demo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyAdapter (fn : FragmentManager) : FragmentPagerAdapter(fn) {
    override fun getItem(position: Int): Fragment {
       return when(position){
           1 -> Fragment2()
           2 -> Fragment3()
           else -> return Fragment1()
       }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(Position : Int) : CharSequence?
    {
        return when(Position){
            1 -> "Two"
            2 -> "Three"
            else -> return "One"
        }
    }
}