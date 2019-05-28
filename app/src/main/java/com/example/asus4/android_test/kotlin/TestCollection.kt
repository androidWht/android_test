package com.example.asus4.android_test.kotlin

fun main() {
    val list = listOf(2, 2, 3, 3, 4, 4)
    val listFilter = list.filter { it > 2 }
    val b = list.any { it == 2 }
    val b1 = listFilter.all { it == 2 }
    val find = list.find { it == 2 }
    val count = list.count { it == 2 }
    val map = listFilter.groupBy { it * 2 }
    println(map)

    val list2 = listOf("abc","abcabc")
    val flatMapList = list2.flatMap {  it.toList() }
    val flatMapSet = list2.flatMap {  it.toSet() }
    println(flatMapList)
    println(flatMapSet)
}


