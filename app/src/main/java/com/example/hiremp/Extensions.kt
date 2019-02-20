package com.example.hiremp

import android.app.Activity
import android.view.View
import androidx.core.content.ContextCompat


fun Activity.changeStatusBarColor(color: Int) {
    if (color == R.color.white) {
        window.statusBarColor = ContextCompat.getColor(this, R.color.white)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
    }
}