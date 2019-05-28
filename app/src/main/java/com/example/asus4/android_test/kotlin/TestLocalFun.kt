package com.example.asus4.android_test.kotlin

/**
 * 测试局部函数
 */

fun main(args: Array<String>) {
    testLocalFun()

    "".local()

}

fun testLocalFun(){

    fun local(){
        println("local fun")
    }

    local()

}


fun String.local(){

    fun local(){
        println("extension local fun $this")
    }

    local()

}