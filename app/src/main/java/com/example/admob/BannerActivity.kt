package com.example.admob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.admob.databinding.ActivityBannerBinding
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError

class BannerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBannerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBannerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bannerAds()
    }

    private fun bannerAds() {
       val adRequest = AdRequest.Builder().build()
        binding.banner.loadAd(adRequest)

        binding.banner.adListener = object : AdListener(){
            override fun onAdLoaded() {
            }
            override fun onAdFailedToLoad(adError : LoadAdError) {
            }
            override fun onAdOpened() {
            }
            override fun onAdClicked() {
            }
            override fun onAdClosed() {
            }
        }
    }
}