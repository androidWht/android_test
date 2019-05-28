package com.example.asus4.android_test.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.example.asus4.android_test.R;

public class FragmentActivity extends android.support.v4.app.FragmentActivity {

    private static final String TAG_FRAGMENT = "test_fragment";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        FragmentManager fragmentManager = getSupportFragmentManager();
        if(fragmentManager.findFragmentByTag(TAG_FRAGMENT) == null){
            FragmentTransaction trans = fragmentManager.beginTransaction();
            TestFragment fragment = TestFragment.getInstance();
            trans.add(R.id.fl_content,fragment,TAG_FRAGMENT);
            trans.commit();
        }
    }




}
