package com.example.swipenavigation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class fragmentadapter (fm : FragmentManager?) : FragmentStatePagerAdapter(fm!!){
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position){
            0 ->{
                Fragment1()
            }
            1 ->{
                Fragment2()
            }
            else->{
                Fragment3()
            }
        }
    }
}