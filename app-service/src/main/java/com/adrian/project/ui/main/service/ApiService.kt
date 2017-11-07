package com.adrian.project.ui.main.service

import android.util.Log

/**
 * Created by cadri on 2017. 08. 03..
 */

class ApiService constructor() {

    object log {
        @JvmStatic val TAG = ApiService::class.java.simpleName
    }

    fun fakeApiCall() {
        Log.i(log.TAG, "fake API call...");
    }
}