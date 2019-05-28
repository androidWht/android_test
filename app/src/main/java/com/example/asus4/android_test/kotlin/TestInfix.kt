package com.example.asus4.android_test.kotlin

/**
 * 测试中缀函数
 * 中缀函数只能有一个参数
 * 中缀函数只能是扩展函数或者成员函数
 *
 * 测试解构声明
 * 解构声明只能应用于本地变量
 */

//扩展中缀函数
infix fun String.testInfix(str:String){

}


class Infix{

    //成员中缀函数
    infix fun testInfix(str:String):Pair<Infix,String>{
        return Pair(this,str)
    }

    fun callInfix(){

        //调用中缀函数，对象 函数名 参数
        val pair = this testInfix ""
        println(pair)
    }

    fun jiegou(){

        //解构声明
        val(key,value) = "one" to 1;

        println(key)

        println(value)
    }


}

