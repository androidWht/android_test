package com.example.asus4.android_test;

import android.app.Application;
import android.util.Log;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(Constants.LIFECYCLE_TAG,"onCreate");
    }
}
