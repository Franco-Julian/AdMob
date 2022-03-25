package com.example.admob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.admob.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var bindind: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindind.root)

        initListeners()
    }

    private fun initListeners(){
        val bannerIntent = Intent(this, BannerActivity::class.java)
        bindind.btnBanner.setOnClickListener { startActivity(bannerIntent) }
    }
}