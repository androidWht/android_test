package com.example.asus4.android_test.kotlin

/**
 * 测试数据类
 * 1 数据类是一种被编译器特殊对待的类，编译器会为其生成一系列的通用方法
 * 2 toString(),equals(),hashCode(),copy()等。
 * 3 数据类必须有至少一个参数的主构造器
 * 4 数据类不能是open abstract inner sealed的
 * 5 copy支持复制一个数据对象并改变值
 * 6 数据对象支持解构声明
 */
data class DataClass constructor(val n:Int){

    val str = "str"
    val i = 1

}


fun main() {
    val data = DataClass(1)
    print(data.toString())


    val list = arrayListOf<String>()
    list.extend()



}