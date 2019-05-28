package com.example.asus4.android_test.kotlin

/**
 * Companion对象使用只能在类内部定义
 * 一个类只能定义一个伴生对象
 * 伴生对象实际就是一个单例的对象，编译时会被编译为外部对象的静态字段
 * object对象不能定义构造函数
 * 伴生对象不能访问外部对象的属性和方法(因为其为静态类型)
 * 伴生对象可以定义init初始化块
 * 伴生对象中的字段会被编译为外部类的静态字段，并且在伴生对象中添加get/set访问器，通过访问器访问。
 *
 */

class TestCompanion{

    val value :String = ""

    companion object {

        var str:String? = null

        init {
            print("init")
        }

    }

}