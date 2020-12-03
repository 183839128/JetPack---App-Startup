package com.duia.jetpackappstartup

import android.app.Application
import android.content.Context
import android.util.Log

/**
 * @fileName: YApplication
 * @date: 2020/12/3 11:09
 * @auther: YuanShuai
 * @tag: class//
 * @describe:
 **/
class YApplication  :Application(){

    override fun onCreate() {
        super.onCreate()
        Log.e("Initializer","(App - Application:${Thread.currentThread().stackTrace[2].lineNumber}) 初始化 context=$applicationContext")
    }
}