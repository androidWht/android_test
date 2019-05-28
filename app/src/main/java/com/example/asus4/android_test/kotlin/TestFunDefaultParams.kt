package com.example.asus4.android_test.kotlin


/**
 * 测试方法默认参数
 */

/**
 * 命名参数和默认参数值
 */
private fun testMethodDefaultValue(name:String = "wht",from:String = "湖南",age:Int = 20){

}



//参数默认值,注解生成重载函数
@JvmOverloads
fun defaultValueMethod(a:String = "",b:Int = 1,C:Char = 'a') = 1;


fun testMethodCall(){
    //使用默认值调用函数
    defaultValueMethod();
    defaultValueMethod("str")
    defaultValueMethod("str",1)
    defaultValueMethod("str",1,'a')

    //只传入参数b
    defaultValueMethod(b=1)

}
