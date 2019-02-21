package com.example.hiremp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CompanyListAdapter(private val context: Context) :
    RecyclerView.Adapter<CompanyListAdapter.CompanyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        CompanyViewHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.layout_item_company, parent, false)
        )

    override fun getItemCount() = 10

    override fun onBindViewHolder(holder: CompanyViewHolder, position: Int) {
    }

    class CompanyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}