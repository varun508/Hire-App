package com.example.hiremp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CandidateListAdapter(private val context: Context) :
    RecyclerView.Adapter<CandidateListAdapter.CandidateViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        CandidateViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_item_candidate, parent, false))

    override fun getItemCount() = 10

    override fun onBindViewHolder(holder: CandidateViewHolder, position: Int) {
    }

    class CandidateViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}