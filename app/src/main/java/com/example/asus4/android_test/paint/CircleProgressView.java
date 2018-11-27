package com.example.asus4.android_test.paint;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class CircleProgressView extends View {

    private static final int DEFAULT_THICKNESS = 6;
    private static final int DEFAULT_ARG_COLOR = 0xfff26b35;
    private static final int DEFAULT_BACKGROUND_COLOR = 0xffffffff;
    private static final int DEFAULT_RING_COLOR = 0xffaaaaaa;

    private int thickness = DEFAULT_THICKNESS;
    private int argColor = DEFAULT_ARG_COLOR;
    private int bgColor = DEFAULT_BACKGROUND_COLOR;
    private int ringColor = DEFAULT_RING_COLOR;

    private final RectF rectF = new RectF();

    private Paint paint;

    private int progress;


    public CircleProgressView(Context context) {
        super(context);
        init();
    }

    public CircleProgressView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CircleProgressView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    /**
     * 设置进度
     * 0 - 360
     */
    public void update(int progress){
        if(progress < 0 || progress > 360){
            throw new IllegalArgumentException("Progress must between 0,360");
        }
        if(this.progress == progress){
            return;
        }
        this.progress = progress;
        invalidate();
    }


    public int getProgress(){
        return progress;
    }


    private void init() {

        thickness = 6;

        paint = new Paint();
        paint.setAntiAlias(true);
    }

    private void resetPaint() {
        paint.reset();
        paint.setAntiAlias(true);
    }


    @SuppressLint("DrawAllocation")
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = getWidth();
        int height = getHeight();


        float centerX = width / 2;
        float centerY = height / 2;

        //绘制背景
        float radius = Math.min(centerX, centerY);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(bgColor);
        canvas.drawCircle(centerX, centerY, radius, paint);

        //绘制环
        resetPaint();
        float ringRadius = Math.min(centerX, centerY) - thickness/2;
        int count = canvas.save();
        canvas.rotate(120, centerX, centerY);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(thickness);
        paint.setColor(ringColor);
        canvas.drawCircle(centerX, centerY, ringRadius, paint);

        //绘制扇形
        canvas.restoreToCount(count);
        resetPaint();
        float left;
        float top;
        float right;
        float bottom;
        if (width > height) {
            left = Math.abs(width - height) / 2 + thickness/2;
            top = thickness/2;
            right = width - Math.abs(width - height) - thickness/2;
            bottom = height - thickness/2;
        } else {
            left = thickness/2;
            top = Math.abs(height - width) / 2 + thickness/2;
            right = width - thickness/2;
            bottom = height - Math.abs(height - width) / 2 - thickness/2;
        }
        rectF.set(left, top, right, bottom);
        int startAngle = 120;

        int sweepAngle = progress;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(argColor);
        paint.setStrokeWidth(thickness);
        canvas.drawArc(rectF, startAngle, sweepAngle, false, paint);

    }



}
