package com.example.hiremp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SelectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection)
        changeStatusBarColor(R.color.white)
    }
}
