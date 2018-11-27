package com.example.asus4.android_test.shader;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

import com.example.asus4.android_test.R;

public class ShaderView extends View {

    private Paint paint;

    private int offset = 0;

    private LinearGradient linearGradient;

    private Bitmap bitmap;

    private Xfermode xfermode;

    int[] colors = {Color.parseColor("#4C4D4B")
            , Color.parseColor("#D9D6DA")
            , Color.parseColor("#4C4D4B")};
    float[] positions = {0.2f, 0.5f, 0.8f};


    public ShaderView(Context context) {
        super(context);
        init();
    }

    public ShaderView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ShaderView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ShaderView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init(){
        paint = new Paint();
        paint.setTextSize(170);
        xfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);

        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.wei_chat_friend);

//        ValueAnimator valueAnimator = new ValueAnimator();
//        valueAnimator.setIntValues(-1000, 1000);
//        valueAnimator.setDuration(2000);
//        valueAnimator.setRepeatCount(-1);
//        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//                offset = (int) animation.getAnimatedValue();
//                linearGradient = new LinearGradient(offset, 300, 1000 + offset, 600
//                        , colors, positions, Shader.TileMode.CLAMP);
//                paint.setShader(linearGradient);
//                invalidate();
//            }
//        });
//
//        valueAnimator.start();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        canvas.drawColor(Color.parseColor("#ffffffff"));
//        paint.setAlpha(255);

        paint.setColor(Color.RED);
        canvas.drawText("演示文字", 200, 500, paint);
//        paint.setXfermode(xfermode);
        paint.setColor(Color.BLACK);
        canvas.drawText("怎么不对", 200, 550, paint);
//        canvas.drawBitmap(bitmap,300,450,paint);
//        paint.setXfermode(null);

    }




}
