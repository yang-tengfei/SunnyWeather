package com.sunnyweather.android

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window,false)
        window.statusBarColor = getColor(R.color.colorPrimary)
        window.navigationBarColor = Color.TRANSPARENT
        setContentView(R.layout.activity_main)
    }
}