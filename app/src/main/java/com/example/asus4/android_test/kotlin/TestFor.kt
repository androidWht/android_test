package com.example.asus4.android_test.kotlin

/**
 * 测试for循环
 */

fun testFor(){

    for(i in 100 downTo 1 step 2){
        print(i);
    }

    for(i in 1..100){
        print(i);
    }

    for(i in 100 until 0){
        print(i);
    }

}