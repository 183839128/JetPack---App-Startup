package com.duia.jetpackappstartup

import android.content.Context
import android.util.Log
import androidx.startup.Initializer

/**
 * @fileName: InitApplication
 * @date: 2020/12/3 11:09
 * @auther: YuanShuai
 * @tag: class//
 * @describe:
 **/
class AInitApplication : Initializer<Unit> {
    override fun create(context: Context) {
        Log.e(
            "Initializer",
            "(A-Initializer:${Thread.currentThread().stackTrace[2].lineNumber}) 初始化 context=$context"
        )
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return listOf(CInitApplication::class.java,BInitApplication::class.java)
//      return emptyList() 如果没有其他的Initializer 返回空数组即可
    }
}