package com.duia.jetpackappstartup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.startup.AppInitializer

/**
 * @auther YuanShuai
 * @date: 2020/12/3 11:08
 * @desc
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //手动触发Initializer
//        AppInitializer.getInstance(this).initializeComponent(CInitApplication::class.java)

    }
}