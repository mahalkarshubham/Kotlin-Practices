package com.shubham.kotlinpractices

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.shubham.kotlinpractices.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var imageList = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        initViewPager()
    }

    private fun initViewPager() {
        postToList()
        binding.viewPager.adapter = ViewPagerAdapter(imageList)
        binding.viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        binding.sliderDots.setViewPager(binding.viewPager)
    }

    private fun addToList(image: Int) {
        imageList.add(image)
    }

    private fun postToList() {
        addToList(R.mipmap.ic_launcher)
        addToList(R.mipmap.ic_launcher)
        addToList(R.mipmap.ic_launcher)
    }
}