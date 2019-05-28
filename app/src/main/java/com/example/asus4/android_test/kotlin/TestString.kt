package com.example.asus4.android_test.kotlin

/**
 * 测试字符串
 */


fun main(args: Array<String>) {
    amtf();
}

fun testStringSplit(){
    val str = "12.345-6.A";

    //按字符串分割
    var result = str.split(".")
    println(result)

    //按正则表达式分割
    result = str.split("[.\\-]".toRegex())
    println(result)
    result = str.split("[.\\-]".toRegex(),2)
    println(result)

    //多字符串分割
    str.split(".","-")
    println(result)

}


fun testStringSubstring(){

    val path = "/User/wang/a/b/test.txt";

    val dir = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val name = fullName.substringBefore(".")
    val extension = fullName.substringAfter(".")

    println(dir)
    println(fullName)
    println(name)
    println(extension)

}


fun testThreeQuotesString(){
    val path = "/User/wang/a/b/test.txt";
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val match = regex.matchEntire(path)
    if(match != null){
        val(dir,name,extension) = match.destructured
        println(dir)
        println(name)
        println(extension)
    }
}

fun amtf(){

    val str = """
      -|-------|-
       | ^   ^ |
       |   ~   |
        ———————
    """
    println(str)
}
