package com.example.asus4.android_test.kotlin

/**
 * 测试字段
 * 1 属性可以被open字段覆盖，表示可覆写，默认是不可覆写
 * 2 覆写只能扩展功能，不能缩小功能
 * 3 定义在主构造器参数如果添加了val或var修饰符，自动变为属性。
 * 4 val属性默认具有get方法，var属性默认具有get和set方法
 */

open class Filed{

    open val value = 1

    private val value1 = 1

    protected val value2 = 1

}

class ChildFiled:Filed(){

    override val value = 2

}


fun main(args: Array<String>) {
    val value = ChildFiled()

    println(value.value)

}

