package com.example.admob

import android.app.Application
import com.google.android.gms.ads.MobileAds

class AdMobapp: Application() {
    override fun onCreate() {
        super.onCreate()
        MobileAds.initialize(this)
    }
}