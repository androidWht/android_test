package com.example.asus4.android_test.kotlin

/**
 * when表达式
 */

fun testWhen(n :Int){

    when(n){
        1 -> n + 1;
        2,3 -> n + 2;
    }


    when(setOf(1,n)){
        setOf(1,n) -> true
        setOf(2,n) -> false
    }

    when{

        n+1 == 0 -> true;

        else -> false
    }

    when(n){

        is Int-> true;

        is Number -> false;

        else -> false

    }


    for(i in 100 downTo 1 step 2){

    }

}
