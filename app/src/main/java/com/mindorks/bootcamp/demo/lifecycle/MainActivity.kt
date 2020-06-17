package com.mindorks.bootcamp.demo.lifecycle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var timerToast: TimerToast

    /**
     * STAGE 1: only onCreate
     * Timer will keep showing toast event activity is in background
     * and also if it is cleared from the task stack
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        timerToast = TimerToast(application,this)
    }


}
