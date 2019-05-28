package com.example.asus4.android_test.kotlin

/**
 * 测试可变长参数
 * 可变长参数使用关键词vararg修饰
 */

//可变长参数定义
fun varage(vararg params:Int){

}

fun callVarageFun(){
    varage(1,2)

    //使用*字符展开数组
    val list = intArrayOf()
    varage(*list)
}

