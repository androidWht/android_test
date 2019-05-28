package com.example.asus4.android_test.kotlin

/**
 * 测试构造器
 *
 * 1 主构造器，定义在类定义处(param1,params2....)
 * 2 从构造器，使用关键词contractor声明
 * 3 init构造器在对象创建时调用，并在从构造器调用前。
 * 4 没有声明主构造器也没有声明从构造器，默认加上无参数主构造器
 * 5 主和从构造器不能定义相同参数列表
 * 6 从构造器必须显示调用主构造器(如果定义了主构造器)
 * 7 主构造器参数加上val或var修饰默认变为成员变量
 */

//默认无参主构造器
class Constructor{}

//无参主构造器
class Constructor1(){}

//有参主构造器
class Constructor2(str:String){}

//初始化块
class Constructor3(str:String){
    init {
        println("object init")
    }
}

//从构造器
class Constructor4{
    init {
        println("object init")
    }
    constructor(n:Int){
        println("constructor")
    }
}

//主从构造器
class Constructor5(n:Int){
    constructor(n:String) : this(0) {}
}

//私有主构造器
class Constructor6 private constructor(){}


//继承调用父类主构造器
open class A(n:Int){}

class B(n:Int):A(n){

}



fun main(args: Array<String>) {
    print(X())
}







class X{

}



