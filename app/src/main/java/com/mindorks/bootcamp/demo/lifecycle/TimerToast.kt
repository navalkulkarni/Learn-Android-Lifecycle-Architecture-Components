package com.mindorks.bootcamp.demo.lifecycle

import android.app.Application
import android.os.CountDownTimer
import android.widget.Toast

class TimerToast(private val context: Application) {

    private val timer = object : CountDownTimer(60000, 3000) {
        override fun onFinish() {
            Toast.makeText(context, "Finish", Toast.LENGTH_SHORT).show()
        }

        override fun onTick(millisUntilFinished: Long) {
            Toast.makeText(context, "$millisUntilFinished", Toast.LENGTH_SHORT).show()
        }
    }

    fun start() {
        timer.start()
    }

    fun stop() {
        timer.cancel()
    }
}