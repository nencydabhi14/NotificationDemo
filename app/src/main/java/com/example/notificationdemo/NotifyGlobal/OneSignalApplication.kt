package com.example.notificationdemo.NotifyGlobal

import android.app.Application
import com.onesignal.OneSignal

class OneSignalApplication : Application() {

    val ONESIGNAL_APP_ID = "fc0fd7d6-6a4c-4459-888f-26897613f25e"

    override fun onCreate() {
        super.onCreate()

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)

        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
    }
}