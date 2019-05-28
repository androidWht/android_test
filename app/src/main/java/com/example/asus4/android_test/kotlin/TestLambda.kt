package com.example.asus4.android_test.kotlin

val a = object {

    fun runnable() {

    }

}

var value: Int = 1

//函数类型变量
var functin: (Int, Int) -> Unit = { a: Int, b: Int ->
    val sum = a + b + value
    println(sum)
    value++
}

fun main() {

    val b = object {

        fun runnable() {

        }


        fun runnable1() {

        }

    }

    b.runnable()

    var value1 = 1
    val functin1: (Int, Int) -> Unit = { a: Int, b: Int ->
        val sum = a + b + value1
        println(sum)
        value1++
    }

    higherFunction(functin1)

    println(value1)

    println(higherFunction(::function2))

}


fun function2(a: Int, b: Int) {
    println(a * b)
}


fun higherFunction(function: (a: Int, b: Int) -> Unit) {
    function(1, 1)
}