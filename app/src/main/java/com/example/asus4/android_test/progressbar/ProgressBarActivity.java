package com.example.asus4.android_test.progressbar;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ProgressBar;

import com.example.asus4.android_test.R;

public class ProgressBarActivity extends AppCompatActivity {

    private final Handler handler = new Handler();

    private ProgressBar progressBar;
    private int progress;

    private Runnable addRunnable = new Runnable() {
        @Override
        public void run() {
            Log.d("ProgressBarActivity","add " + progress + "");
            progress++;
            if(progress <= 100){
                progressBar.setProgress(progress);
                handler.postDelayed(addRunnable,30);
            }else {
                progress = 100;
                handler.postDelayed(reduceRunnable,30);
            }
        }
    };

    private Runnable reduceRunnable = new Runnable() {
        @Override
        public void run() {
            Log.d("ProgressBarActivity","reduce " + progress + "");
            progress--;
            if(progress >= 0){
                progressBar.setProgress(progress);
                handler.postDelayed(reduceRunnable,30);
            }else {
                progress = 0;
                handler.postDelayed(addRunnable,30);
            }
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        progressBar = findViewById(R.id.progress_bar);

        handler.postDelayed(addRunnable,300);

    }
}
