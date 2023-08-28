package com.example.swipenavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager : ViewPager = findViewById<ViewPager>(R.id.viewpager)
        val adapter = fragmentadapter(supportFragmentManager)
        viewPager.adapter = adapter
    }
}