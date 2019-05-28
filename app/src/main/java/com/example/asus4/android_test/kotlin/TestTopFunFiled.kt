/**
 * 测试顶级函数和字段
 * 1 在类外定义的函数和字段称为顶层函数和顶层属性
 * 2 顶层函数和类名将包含在由编译器自动创建的类中
 * 3 使用@file:JvmName("Name")可以指定生成的包含顶层函数和字段的类名
 * 4 外部调用顶层函数需要导入，kotlin支持导入方法
 * 5 不能定义具有相同名称的顶层字段(这一点有疑惑，如果与外部模块定义冲突，不是很容易编译错误)
 */


//设置顶层函数编译后生成的类名
@file:JvmName("TopMethod")
package com.example.asus4.android_test.kotlin

//顶层函数,编译器将生成一个class文件，所有顶层函数都包含在里面
fun testTopMethod(){

}

//顶层属性,编译器将生成一个class文件，所有顶层函数都包含在里面
var topFiled:String = ""