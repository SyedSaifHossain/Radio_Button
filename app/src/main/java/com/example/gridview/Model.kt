package com.example.gridview

class Model(private var courseName : String, private var courseImg : Int) {

    fun getcourseName():String{
        return courseName
    }
    fun getcourseImg():Int{
        return courseImg
    }
    fun setCourseName(courseName:String){
        this.courseName=courseName
    }

    fun setCourseImg(courseImg:Int){
        this.courseImg=courseImg
    }

}