package com.example.asus4.android_test.kotlin

/**
 * 测试内部类
 * 内部类默认不持有外部类引用
 * 使用inner修饰符的内部类持有外部类引用
 *
 * sealed关键词
 * sealed关键词修饰class，表示密封类
 * 1 所以子类只能在内部定义
 * 2 只能用于类，不能用于接口
 * 3 sealed类默认是open类型的
 * 4 sealed类构造器只能是private的
 */

class Outer{

    private val str = "";

    class Inner{
        //默认不持有外部类引用
    }
    inner class Inner1{
        //持有外部类应用
        private val str = this@Outer.str
    }

}

//密封类
sealed class SealedClass{
    class A:SealedClass(){}
    class B:SealedClass(){}
}


