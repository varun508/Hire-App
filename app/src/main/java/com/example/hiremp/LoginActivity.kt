package com.example.hiremp

import android.os.Bundle
import android.app.Activity
import android.content.Intent

import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val asIntent = intent.getIntExtra("as", 0)
        floatingActionButton.setOnClickListener {
            if (asIntent == EMPLOYEE) {
                startActivity(Intent(this, CompaniesActivity::class.java).apply {
                    putExtra("as", asIntent)
                })
            } else {
                startActivity(Intent(this, CandidateListActivity::class.java).apply {
                    putExtra("as", asIntent)
                })
            }
        }
    }

}
