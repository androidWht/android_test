package com.example.asus4.android_test.jni;

public class JniTest {

    static {
        System.loadLibrary("JniTest");
    }

    public native void callJni();


}
