package com.example.asus4.android_test.kotlin

/**
 * 可见性修饰符
 *
 * 1 默认是public的
 * 2 private 文件内可访问
 * 3 protected 子类可访问(与java意义不同，在java中包内也可方法protected成员)
 * 4 internal 模块内方法(类似与java的default，但封装定义了模块的概念)
 * 5 public 任何地方都能访问
 *
 *
 * 访问修饰符
 * final 不可被重写 kotlin中成员默认都是final的
 * open 可以被重写
 * abstract 抽象的，与java中含义相同
 * override 重写父类或接口中的成员，与java含义一样，不同的是kotlin中是强制的，不写无法编译。
 *
 *
 * internal实现细节
 * internal修饰符会被编译成public。
 * 所以在另一个模块的java代码中可以访问internal声明的成员
 * 从同一个包中java代码可以访问一个protected的成员。
 */



