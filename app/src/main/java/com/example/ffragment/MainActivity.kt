package com.example.ffragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = PageAdapter(supportFragmentManager)
        adapter.addFragment(BlankFragment()," Первый фрагмент ")
        adapter.addFragment(BlankFragment2()," Второй фрагмент ")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
}
