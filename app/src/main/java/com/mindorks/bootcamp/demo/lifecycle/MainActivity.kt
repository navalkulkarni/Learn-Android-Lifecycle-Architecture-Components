package com.mindorks.bootcamp.demo.lifecycle

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    /**
     * STAGE 1: only onCreate
     * Timer will keep showing toast event activity is in background
     * and also if it is cleared from the task stack
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        viewModel.timerData.observe(this, Observer {
            Toast.makeText(applicationContext,it,Toast.LENGTH_SHORT).show()
        })

        viewModel.start()
    }


}
