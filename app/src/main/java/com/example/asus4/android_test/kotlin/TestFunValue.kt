package com.example.asus4.android_test.kotlin

/**
 * 测试函数变量
 */

//定义函数变量
val def:(n:Int,str:String)-> String? = { n: Int, str: String ->
    null
}

fun aa(){
    a(def);
}

fun  a(def:(n:Int,str:String) -> String?){
    def(1,"")
}

fun aaa():(n:Int)->Unit{
    val def:(n:Int)->Unit = {n:Int -> Unit

    }
    return def
}


