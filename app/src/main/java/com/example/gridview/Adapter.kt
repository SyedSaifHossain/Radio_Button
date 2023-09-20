package com.example.gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ListMenuItemView


class Adapter(context: Context, courseList: ArrayList<Model>):ArrayAdapter<Model?>(context,0,courseList as List<Model>) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView = convertView
        if(listItemView == null){
            listItemView = LayoutInflater.from(context).inflate(R.layout.gridlayout, parent, false)
        }
        var courseModel:Model? = getItem(position)
        var courseName = listItemView!!.findViewById<TextView>(R.id.itemName)
        var courseImg = listItemView!!.findViewById<ImageView>(R.id.itemImg)
        courseName.setText(courseModel!!.getcourseName())
        courseImg.setImageResource(courseModel!!.getcourseImg())
        return super.getView(position, convertView, parent)
    }

}

