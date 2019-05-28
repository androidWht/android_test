package com.example.asus4.android_test.kotlin

class TestGetSet{

    private var value  = ""
    get() = field
    set(value) {
        field = value
    }
    var value1 = ""
        get() = field + 1
        set(value) {
            field = value + 1
        }
}

fun main() {
    val test = TestGetSet()
    //编译错误
//    var value = test.value
//    test.value = ""
}
