package com.example.androidsecurekeys

import android.app.Application
import android.util.Log

class MyApplication : Application() {
    private external fun getKeyFromApplicationClass(): String?

    init {
        System.loadLibrary("keys")
    }

    override fun onCreate() {
        super.onCreate()
        Log.d("MyApplicationClass", getKeyFromApplicationClass()!!)
    }
}
