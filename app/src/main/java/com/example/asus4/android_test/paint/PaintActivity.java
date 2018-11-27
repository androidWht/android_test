package com.example.asus4.android_test.paint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.asus4.android_test.R;

public class PaintActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paint);

        CircleProgressView circleProgressView = findViewById(R.id.progress_circular);
        CircleProgressUpdateAnim circleProgressUpdateAnim = new CircleProgressUpdateAnim(circleProgressView);

        circleProgressUpdateAnim.increase();

    }
}
