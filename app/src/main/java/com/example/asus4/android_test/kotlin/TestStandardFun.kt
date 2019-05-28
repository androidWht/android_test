package com.example.asus4.android_test.kotlin

/**
 * 测试kotlin标准函数
 */
fun test(){

    val str = "abc"

    /**
     * 用str作为参数，执行一段lamda代码，并返回str
     */
    val alsoResult = str.also {

    }

    /**
     * 用str作为参数，执行lamda代码，返回lamda执行结果
     */
    val letResult = str.let {

    }

    /**
     * 执行带有str的lamda代码，并返回结果
     */
    val length = str.run {

    }

    /**
     * 执行带有str的lamda代码，并返回str
     */
    str.apply {

    }

    /**
     * 执行lamda，结果为true，返回当前对象
     * 结果为false返回null
     */
    val takeIfResult = str.takeIf {
        str.isNotEmpty()
    }

    /**
     * 执行lamda，结果为true，返回null
     * 结果为false返回当前对象
     */
    val takeUnless = str.takeUnless {
        str.isEmpty()
    }


    with(1) {

    }

}
