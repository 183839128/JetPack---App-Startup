package com.duia.jetpackappstartup

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri
import android.util.Log
import java.util.logging.Handler

/**
 * @fileName: MyProvider
 * @date: 2020/12/3 15:38
 * @auther: YuanShuai
 * @tag: class//
 * @describe:用做演示无需使用
 **/
class MyProvider :ContentProvider() {
    override fun insert(uri: Uri, values: ContentValues?): Uri? {
        return null
    }

    override fun query(
        uri: Uri,
        projection: Array<out String>?,
        selection: String?,
        selectionArgs: Array<out String>?,
        sortOrder: String?
    ): Cursor? {
        return null
    }

    override fun onCreate(): Boolean {
       context?.apply{
           Log.e("Initializer","(ContentProvider:${Thread.currentThread().stackTrace[2].lineNumber}) 初始化 context=$context")
       }
       return true
    }

    override fun update(
        uri: Uri,
        values: ContentValues?,
        selection: String?,
        selectionArgs: Array<out String>?
    ): Int {
        return 0
    }

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<out String>?): Int {
        return 0
    }

    override fun getType(uri: Uri): String? {
        return null
    }
}