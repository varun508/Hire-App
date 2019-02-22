package com.example.hiremp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.layout_item_company.view.*

class CompanyListAdapter(
    private val context: Context,
    private val asIntent: Int
) :
    RecyclerView.Adapter<CompanyListAdapter.CompanyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        CompanyViewHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.layout_item_company, parent, false)
        )

    override fun getItemCount() = 5

    override fun onBindViewHolder(holder: CompanyViewHolder, position: Int) {
        holder.itemView.materialButton4.setOnClickListener {
            holder.click(context,asIntent)
        }
    }

    class CompanyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun click(context: Context, asIntent: Int) {
            if (asIntent == EMPLOYEE) {
                context.startActivity(Intent(context, QuestionsActivity::class.java).apply {
                    putExtra("as", asIntent)
                })
            }
        }
    }
}