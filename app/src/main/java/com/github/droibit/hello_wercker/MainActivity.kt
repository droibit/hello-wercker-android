package com.github.droibit.hello_wercker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.github.droibit.hello_wercker.R.layout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
    }
}
