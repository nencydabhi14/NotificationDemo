package com.example.notificationdemo.NotifyLocal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notificationdemo.NotifyLocal.Notification
import com.example.notificationdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)


        mainBinding.getNotifyBtn.setOnClickListener {
            Notification.exampleNotification(
                this@MainActivity, "Hello Android", "It's was a Local Notification"
            )
        }

    }
}