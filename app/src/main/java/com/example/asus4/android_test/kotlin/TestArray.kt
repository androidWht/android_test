package com.example.asus4.android_test.kotlin

/**
 * 测试数组使用
 */

//基本类型数组
var array:IntArray = intArrayOf(1,2);
//对象类型数组
var array1:Array<Int> = arrayOf(1,2)

fun testArray(array:IntArray){
    array[0] = 1;
    println(array[0])
}



