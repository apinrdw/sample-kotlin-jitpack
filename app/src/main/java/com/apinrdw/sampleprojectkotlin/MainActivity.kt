package com.apinrdw.sampleprojectkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.gani.lib.ui.view.GTextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        contentLayout.addView(GTextView(this).text("Hello World"))
    }
}
