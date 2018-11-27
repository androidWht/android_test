package com.example.asus4.android_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.asus4.android_test.constraintlayout.ConstraintLayoutActivity;
import com.example.asus4.android_test.paint.PaintActivity;
import com.example.asus4.android_test.progressbar.ProgressBarActivity;
import com.example.asus4.android_test.shader.ShaderActivity;
import com.example.asus4.android_test.webvideo.WebVideoActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jumpActivity(View view){
        startActivity(PaintActivity.class);
    }

    private void startActivity(Class<?> cls){
        Intent intent = new Intent(this,cls);
        startActivity(intent);
    }
    
}
