package com.example.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class MainActivity : AppCompatActivity() {
    private lateinit var gridView : GridView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.gridView)
        val courseList:ArrayList<Model> = ArrayList<Model>()
        courseList.add(Model("Kotlin", R.drawable.kotlin))
        courseList.add(Model("Python", R.drawable.python))
        courseList.add(Model("JavaScript", R.drawable.javascript))
        courseList.add(Model("C", R.drawable.cprogram))
        courseList.add(Model("Swift", R.drawable.swift))

        val adapter = Adapter(this,courseList)

        gridView.adapter=adapter

    }

}