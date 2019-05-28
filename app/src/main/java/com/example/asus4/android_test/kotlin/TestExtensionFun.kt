package com.example.asus4.android_test.kotlin

/**
 * 扩展函数和属性测试
 * 扩展函数不能重复定义
 * 扩展函数是通过静态函数实现，对象实例通过参数传入，所以扩展函数只能使用对象的public方法和属性。
 * 扩展函数可以定义在类内部，定义在类内部的扩展函数不能在类外部调用
 */

//扩展函数，给ArrayList添加一个扩展函数extend
fun <T> ArrayList<T>.extend(): Int {
    return this.size
}

class TestExtensionFun{
    //只能在类内部调用
    fun String.extension(){

    }

    fun call(){
        "".extension()
    }

}


fun main() {
    val list = ArrayList<String>()
    list.extend()
}


/**
 * 扩展函数不能动态绑定，如果父类和子类具有相同的扩展函数，调用的是申明类型的函数
 * 扩展函数和实例函数相同，调用的是实例函数
 * 扩展函数和静态函数相同，调用的是静态函数
 */

//父类扩展函数
fun <E> Collection<E>.split() {
    println("Collection Extend Fun")
}

//子类扩展函数
fun <E> List<E>.split() {
    println("List Extend Fun")
}

fun <E> List<E>.isEmpty() {
    println("Same as Object Fun")
}

fun Thread.interrupted() {
    println("Same as Static Fun")
}


/**
 * 扩展属性是虚属性，没有地方存储
 * 扩展属性不用导入即可使用
 * 定义相同的扩展属性编译器会报错
 * 扩展属性和类属性相同，调用的是类属性
 */

var String.extendFiled: String
    get() = "";
    set(value) {

    }

val String.extendFiled1:String
    get() = "";

val String.length:Int
    get() = 1;
