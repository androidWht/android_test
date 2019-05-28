package com.example.asus4.android_test.kotlin

/**
 * 测试实体类
 */
class Rectangle(var width:Int ,var height:Int){

    //必须初始化
    var str:String = "Not Null"

    //可延迟初始化
    lateinit var str1:String;

    //自定义访问器
    val isSquare:Boolean
    get() {
        return width == height;
    }
    //自定义访问器
    var isSquare1:Boolean
    get() = width == height;
    set(value) {
        if(value){
            height = 1
            width = 1
        }else{
            height = 1
            width = 2
        }
    }

}