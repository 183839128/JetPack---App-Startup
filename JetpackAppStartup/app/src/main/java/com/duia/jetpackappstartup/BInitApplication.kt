package com.duia.jetpackappstartup

import android.content.Context
import android.util.Log
import androidx.startup.Initializer

/**
 * @fileName: BInitApplication
 * @date: 2020/12/3 15:52
 * @auther: YuanShuai
 * @tag: class//
 * @describe:
 **/
class BInitApplication:Initializer<Unit> {
    override fun create(context: Context) {
        Log.e(
            "Initializer",
            "(B-Initializer:${Thread.currentThread().stackTrace[2].lineNumber}) 初始化 context=$context"
        )
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}