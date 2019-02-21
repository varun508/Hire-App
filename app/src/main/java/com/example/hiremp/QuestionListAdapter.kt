package com.example.hiremp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class QuestionListAdapter(private val context: Context) :
    RecyclerView.Adapter<QuestionListAdapter.QuestionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        QuestionViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_item_question, parent, false))

    override fun getItemCount() = 10

    override fun onBindViewHolder(holder: QuestionViewHolder, position: Int) {
    }

    class QuestionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}