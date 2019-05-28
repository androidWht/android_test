package com.example.asus4.android_test.kotlin

import java.util.*
import kotlin.collections.ArrayList

/**
 * 测试by关键词
 * by关键词表示类委托
 * 编译器将自动创建
 */
class MyList<E>:List<E> by ArrayList<E>() {

}


class MyList1<E>(innerList:ArrayList<E>):List<E> by innerList{

}


fun main(args: Array<String>) {

}