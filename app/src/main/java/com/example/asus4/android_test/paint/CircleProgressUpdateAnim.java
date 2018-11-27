package com.example.asus4.android_test.paint;

import android.animation.Animator;
import android.animation.ValueAnimator;

public class CircleProgressUpdateAnim {

    private final CircleProgressView circleProgressView;

    private ValueAnimator animator;

    CircleProgressUpdateAnim(CircleProgressView circleProgressView) {
        this.circleProgressView = circleProgressView;
    }

    private void setProgress(int progress) {
        if(animator != null){
            animator.cancel();
        }
        animator = ValueAnimator.ofInt(circleProgressView.getProgress(), progress);
        animator.setDuration(2000);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int progress = (int) animation.getAnimatedValue();
                circleProgressView.update(progress);
            }
        });
        animator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                if(circleProgressView.getProgress() == 0){
                    increase();
                }else {
                    reduce();
                }
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
        animator.start();
    }

    void increase(){
        setProgress(360);
    }

    void reduce(){
        setProgress(0);
    }

}
