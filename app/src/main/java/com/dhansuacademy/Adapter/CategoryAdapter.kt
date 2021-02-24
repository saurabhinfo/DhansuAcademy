package com.dhansuacademy.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.dhansuacademy.HomeModule.SelectCategoryParent
import com.dhansuacademy.MainActivity
import com.dhansuacademy.R


internal class CategoryAdapter(private var categoryListArray: ArrayList<String> , private var context: Context  ) :
        RecyclerView.Adapter<CategoryAdapter.MyViewHolder>() {

    var context_value = context

    internal inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var txtItem: TextView = view.findViewById(R.id.txtItem)
        var sub_cat_items_selection:LinearLayout = view.findViewById(R.id.sub_cat_items_selection)

    }
    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.sub_cat_item, parent, false)
        return MyViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val categoryName = categoryListArray[position]
        holder.txtItem.text = categoryName
        holder.sub_cat_items_selection.setOnClickListener {

            val intent = Intent(context_value, MainActivity::class.java)
            context_value.startActivity(intent)
        }
    }
    override fun getItemCount(): Int {
        return categoryListArray.size
    }
}
