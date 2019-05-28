package com.example.asus4.android_test.kotlin

/**
 * 测试区间
 * in关键词
 */

fun testSection(){

    //创建区间[1,10]
    val n = 1..10

    //从头到尾遍历区间
    for(i in n){
        println(i);
    }

    //从头到尾便利区间步长为2
    for(i in n step 2){
        println(i)
    }

    //从10 到 1 便利区间 步长为2
    for(i in 10 downTo 1 step 2){
        println(i)
    }

    //从0 - 9遍历 步长为2
    for(i in 0 until 10 step 2){
        println(i)
    }

    //展开map
    val map = HashMap<String,String>()
    for((k,v) in map){
        println("k = $k,v = $v")
    }

    //遍历并显示index
    for((index,i) in n.withIndex()){
        println("index=$index,v=$i")
    }

}

//测试函数变量和in关键字
fun isLetter(letter:Char) :Boolean = letter in 'a'..'z'
fun notLetter(letter:Char) :Boolean = letter !in 'a'..'z'