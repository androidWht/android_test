package com.example.asus4.android_test.kotlin

/**
 * 测试接口属性
 * 1 接口中可定义抽象的或具体的属性(没有分配值)
 */

fun main(args: Array<String>) {

    val value = Class1();
    println(value.value1)
}


interface Interface{

    val value:String

    var value1:String

    val value2:String
        get() = "";

    var value3:String
        get() = ""
        set(value) {}
}

open class Class:Interface{

    override val value: String
        get() = "Class"

    override var value1: String
        get() = "Class"
        set(value) {}

    override val value2: String
        get() = super.value2

    override var value3: String
        get() = super.value3
        set(value) {}
}


class Class1: Class() {
    override val value: String
        get() = "Class1"
    override var value1: String
        get() = "Class1"
        set(value) {}

}

class Class2(override val value: String, override var value1: String) : Interface {

}