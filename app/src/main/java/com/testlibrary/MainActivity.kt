package com.testlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abhishek.mylibrary.Abhishek
import com.abhishek.mylibrary.TestSDK

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TestSDK.addVariable(10, 20)


    }
}