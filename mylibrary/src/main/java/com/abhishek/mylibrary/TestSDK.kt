package com.abhishek.mylibrary

import android.util.Log

object TestSDK : TestListener {
    override fun addVariable(first: Int, second: Int) {
        Log.d("Test SDK", "Addition of two variable is :" + (first + second))
    }
}