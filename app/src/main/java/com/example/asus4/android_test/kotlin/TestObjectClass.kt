package com.example.asus4.android_test.kotlin

/**
 * 测试Object class
 * 1 object对象能实现单例，匿名内部类，伴生对象
 * 2 object class不能有构造器
 */

object Object{

    private val n = 1

    //匿名内部类
    val value = object {

    }


    fun obj(){

    }

}



class Cls{

    //伴生对象
    companion object {

    }

}


fun main(args: Array<String>) {

    val str = ""
    str.also {

    }

}
