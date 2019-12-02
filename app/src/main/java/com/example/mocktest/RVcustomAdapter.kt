package com.example.mocktest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.TooltipCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.grid.view.*

class RVcustomAdapter(val context: Context,val  datas:ArrayList<GridContent>,val navigate:(Int)->Unit) : RecyclerView.Adapter<ViewHolder1>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder1 {
        return ViewHolder1(LayoutInflater.from(context).inflate(R.layout.grid, parent, false))
    }

    override fun getItemCount(): Int {
        return datas.size
    }
    override fun onBindViewHolder(holder: ViewHolder1, position: Int) {
//        holder.role.text=datas[position].data
        holder.role.setImageResource(datas[position].image)
        holder.itemView.setOnClickListener {

            navigate(position)
        }
    }
}
 class ViewHolder1(view: View):RecyclerView.ViewHolder(view){
    val role=view.imageView7
}
