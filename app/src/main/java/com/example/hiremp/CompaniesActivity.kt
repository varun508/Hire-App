package com.example.hiremp

import android.os.Bundle
import android.app.Activity
import android.content.Context
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yalantis.filter.adapter.FilterAdapter
import com.yalantis.filter.widget.Filter
import com.yalantis.filter.widget.FilterItem
import kotlinx.android.synthetic.main.activity_companies.*
import org.jetbrains.annotations.NotNull

class CompaniesActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_companies)


        val list = listOf(
            "Android", "Web", "Java", "Python", "PHP", "Agile", "SQL", "NoSQL", "Machine Learning",
            "Data Science"
        )

        val mFilter = findViewById<Filter<Tag>>(R.id.filter)
        mFilter.adapter = CandidateListActivity.Adapter(list.map { Tag(it) }, this)

        //the text to show when there's no selected items
        mFilter.noSelectedItemText = ("All categories")
        mFilter.build()

        rvCompanyList.adapter = CompanyListAdapter(this)
        rvCompanyList.layoutManager = LinearLayoutManager(this).also {
            it.orientation = RecyclerView.VERTICAL
        }
        rvCompanyList.setHasFixedSize(true)
    }

    class Adapter(@NotNull items: List<Tag>, private val context: Context) : FilterAdapter<Tag>(items) {

        @NotNull
        override fun createView(position: Int, item: Tag): FilterItem {
            val filterItem = FilterItem(context)

            filterItem.strokeColor = ContextCompat.getColor(context, R.color.textGray)
            filterItem.textColor = ContextCompat.getColor(context, R.color.textBlack)
            filterItem.checkedTextColor = ContextCompat.getColor(context, android.R.color.white)
            filterItem.color = ContextCompat.getColor(context, android.R.color.white)
            filterItem.checkedColor = ContextCompat.getColor(context, R.color.themeMain)
            filterItem.text = item.getText()
            filterItem.deselect()
            return filterItem
        }
    }

}
