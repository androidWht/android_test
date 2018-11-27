package com.example.asus4.android_test.kotlin

class KotlinTest{

    val oneToThen = 1..100;


    fun call(){

        testMethodDefaultValue(name = "wht",age = 20);

    }


    fun testFor(){

        for(i in 100 downTo 1 step 2){
            print(i);
        }

        for(i in 1..100){
            print(i);
        }

        for(i in 100 until 0){
            print(i);
        }

    }

    /**
     * 命名参数和默认参数值
     */
    private fun testMethodDefaultValue(name:String = "wht",from:String = "湖南",age:Int = 20){

    }


}
