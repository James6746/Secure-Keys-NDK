package com.example.androidsecurekeys

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var serverKey = BuildConfig.SERVER_KEY
    var smsKey = BuildConfig.SMS_KEY

    init {
        System.loadLibrary("keys")
    }

    external fun getPublicKey(): String?
    external fun getPrivateKey(): String?

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("TAG", "onCreate: $serverKey")
        Log.d("TAG", "onCreate: $smsKey")

        Log.d("TAG", "PublicKey: ${getPublicKey()}")
        Log.d("TAG", "PrivateKey: ${getPrivateKey()}")
    }
}