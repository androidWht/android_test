// ITest.aidl
package com.example.asus4.android_test;

// Declare any non-default types here with import statements

interface ITest {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
            double aDouble, String aString);

    String getStringFromRemote();

    int testIn(in List<String> inParams);

    int testOut(out List<String> outParams);

    int testInOut(inout List<String> inoutParams);

    oneway void testOneWay();

}
