package com.example.asus4.android_test.kotlin

/**
 * 接口可以定义实现方法，称为默认方法，通过实例调用
 * 子类可以重写父类的默认方法
 *
 * 默认方法实现原理：Kotlin1.0是以Java6.0为基础设计的，其并不支持接口中的默认方法。
 * 因此它会把每个带默认方法的接口编译成一个普通的接口和一个将方法作为静态函数的类的结合。
 * 接口中只包含声明，类中包含了默认方法实现。
 * 如果在java中实现这样一个接口，必须为接口中所有方法（包括默认方法）定义自己的实现
 *
 * 类默认是final的，不可被继承
 * 使用open关键词修饰的类和方法才能被继承
 *
 * 主构造器和从构造器
 * 1 主构造器和从构造器参数列表不能冲突
 * 2 如果定义了主构造器，从构造器必须显示调用主构造器
 */

//接口
interface Animal{

    fun sleep()

    fun eat(){
        println("Animal eat fun")
    }

}

//类
open class Human:Animal{

    override fun sleep(){
        println("Human sleep fun")
    }

    override fun eat() {
        println("Human eat fun")
    }

}


class Child: Human() {

    override  fun sleep() {
        println("Child eat fun")
    }

    override fun eat() {
        println("Child eat fun")
    }

}


fun main(args: Array<String>) {

    val human = Human()
    human.eat()
    human.sleep()

    val animal = human as Animal
    animal.eat()
    animal.sleep()
}
