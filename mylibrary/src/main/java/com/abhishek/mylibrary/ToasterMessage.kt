package com.abhishek.mylibrary

import android.content.Context
import android.widget.Toast

/***
 * Created by Dipen Jansari on 2020-02-16
 *
 * Description :
 *
 * Copyright(c) 2020 ToasterExample.
 * All rights reserved.
 */
class ToasterMessage {
    companion object {
        fun toastMessage(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}