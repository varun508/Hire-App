package com.example.hiremp

import android.os.Bundle
import android.app.Activity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_candidate_list.*

import kotlinx.android.synthetic.main.activity_questions.*

class QuestionsActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        rvQuestionList.adapter = QuestionListAdapter(this)
        rvQuestionList.layoutManager = LinearLayoutManager(this).also {
            it.orientation = RecyclerView.VERTICAL
        }
        rvQuestionList.setHasFixedSize(true)
    }

}
