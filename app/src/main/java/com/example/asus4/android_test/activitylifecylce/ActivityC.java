package com.example.asus4.android_test.activitylifecylce;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.asus4.android_test.Constants;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(Constants.LIFECYCLE_TAG,getClass().getSimpleName() + "onCreate");


        Button btn = new Button(this);
        btn.setText("点击崩溃");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String str = null;
               str.length();
            }
        });

        setContentView(btn);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Constants.LIFECYCLE_TAG,getClass().getSimpleName() + "onStart");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(Constants.LIFECYCLE_TAG,getClass().getSimpleName() + "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Constants.LIFECYCLE_TAG,getClass().getSimpleName() + "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Constants.LIFECYCLE_TAG,getClass().getSimpleName() + "onStop");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Constants.LIFECYCLE_TAG,getClass().getSimpleName() + "onDestroy");
    }


    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.d(Constants.LIFECYCLE_TAG,"onSaveInstanceState");
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(Constants.LIFECYCLE_TAG,"onRestoreInstanceState");
    }
}
