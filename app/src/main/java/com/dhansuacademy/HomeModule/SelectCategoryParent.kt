package com.dhansuacademy.HomeModule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dhansuacademy.Adapter.CategoryAdapter
import com.dhansuacademy.R

class SelectCategoryParent : AppCompatActivity() {

    private lateinit var select_category_recycleView:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_category)
        select_category_recycleView = findViewById(R.id.select_category_recycleView)


        select_category_recycleView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val categoryListArray = ArrayList<String>()
        categoryListArray.add("Indian Administrative Service (IAS)")
        categoryListArray.add("Indian Foreign Service (IFS)")
        categoryListArray.add("Indian Police Service (IPS)")
        categoryListArray.add("Indian Revenue Service.")
        categoryListArray.add("Indian Foreign Service")
        categoryListArray.add("Indian Police Service")
        categoryListArray.add("SBI PO Examination")
        categoryListArray.add("LIC AAO Examination")
        categoryListArray.add("IBPS PO Examination")
        categoryListArray.add("RBI Grade B Examination")
        categoryListArray.add("IBPS SO Examination")
        categoryListArray.add("SSC CGL Examination")
        categoryListArray.add("Indian Railways Examination")
        categoryListArray.add("SBI Clerk Examination")
        categoryListArray.add("SSC CPO")
        categoryListArray.add("SSC JE")
        categoryListArray.add("RRB ALP")
        categoryListArray.add("RRB JE")
        categoryListArray.add("SSC SHSL")
        categoryListArray.add("IBPS RRB")
        val adapter = CategoryAdapter(categoryListArray,this)
        select_category_recycleView.adapter = adapter
    }
}