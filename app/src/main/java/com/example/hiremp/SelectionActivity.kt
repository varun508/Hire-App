package com.example.hiremp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_selection.*

class SelectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection)
        changeStatusBarColor(R.color.white)

        val intent = Intent(this, LoginActivity::class.java)
        materialButton.setOnClickListener {
            intent.putExtra("as", EMPLOYER)
            startActivity(intent)
        }

        materialButton2.setOnClickListener {
            intent.putExtra("as", EMPLOYEE)
            startActivity(intent)
        }

        val snack = Snackbar
            .make(
                rootView,
                "Click Employer or Employee button to open related screens", Snackbar.LENGTH_INDEFINITE
            )

        snack.setAction("Okay"){
            snack.dismiss()
        }.show()

    }
}
