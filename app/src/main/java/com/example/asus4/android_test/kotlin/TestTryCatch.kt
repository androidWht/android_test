package com.example.asus4.android_test.kotlin

import java.io.File
import java.io.FileInputStream
import java.lang.Exception
import java.lang.IllegalArgumentException

/**
 * 测试try-catch
 * try语句是一个表达式
 * kotlin中不需要显示声明throws
 */

fun testTryCatch(){
    val number = try{
        1
    }catch (e: Exception){
        -1
    }finally {
        println("finally")
    }

    when(number){
        -1 -> throw IllegalArgumentException()

        else -> {
            val file = FileInputStream(File(""))
            file.read();
        }
    }
    print(number)
}

fun main() {
    testTryCatch()
}
