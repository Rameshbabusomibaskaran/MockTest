package com.example.mocktest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MangaeCustomAdapter(val context: Context,val list:ArrayList<ManageUser>,val navigate:(Int,String)->Unit): BaseAdapter() {

    private class viewHolder(row: View)
    {
        var imageView: ImageView
        var imageView6:ImageView
        var textView18: TextView
        var textView19: TextView
        // var button5: Button
        init {
            this.textView18=row?.findViewById(R.id.textView) as TextView
            this.textView19=row?.findViewById(R.id.textView3) as TextView
            this.imageView6=row?.findViewById(R.id.imageView6) as ImageView
            this.imageView=row?.findViewById(R.id.imageView8) as ImageView
        }
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View?
        var viewHolder:viewHolder
        if(convertView==null)
        {
            var inflater= LayoutInflater.from(context)
            view =inflater.inflate(R.layout.activity_users,parent,false)
            viewHolder=viewHolder(view)
            view.tag=viewHolder
        }
        else
        {
            view=convertView
            viewHolder=view.tag as viewHolder
        }
        viewHolder.imageView6.setOnClickListener {

            navigate(position,"delete")
        }

        viewHolder.imageView.setOnClickListener {

            navigate(position,"ChangeImage")
        }
        var img=getItem(position)
        var image:ManageUser=getItem(position) as ManageUser
        viewHolder.textView18.text=image.data
        viewHolder.textView19.text=image.data1
        viewHolder.imageView.setImageResource(image.img)
        viewHolder.imageView6.setImageResource(image.img1)
        return  view as View
    }
    override fun getItem(position: Int): Any {
        return list.get(position)
    }
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    override fun getCount(): Int {
        return list.count() }
}

