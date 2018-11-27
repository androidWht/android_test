package com.example.asus4.android_test.webvideo;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;


/**
 *
 * 清单文件设置
 * android:configChanges="orientation|keyboard|screenSize|keyboardHidden"
 * <uses-permission android:name="android.permission.INTERNET"/>
 *
 */



public class WebVideoActivity extends AppCompatActivity {

    private static final String TAG = "WebVideoActivity";

    private ViewGroup contentView;
    private WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        contentView = new FrameLayout(this);
        webView = new WebView(this);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            settings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        }
        webView.setWebChromeClient(webChromeClient);
        webView.setWebViewClient(new WebViewClient());
        contentView.addView(webView, new FrameLayout.LayoutParams
                (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

        setContentView(contentView, new ViewGroup.LayoutParams
                (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

        webView.loadUrl("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4");

    }


    private WebChromeClient webChromeClient = new WebChromeClient() {

        private CustomViewCallback customViewCallback;
        private View customView;

        @Override
        public void onShowCustomView(View view, CustomViewCallback callback) {
            Log.d(TAG, "onShowCustomView");

            customViewCallback = callback;
            customView = view;

            webView.setVisibility(View.GONE);

            view.setBackgroundColor(ContextCompat.getColor(WebVideoActivity.this,android.R.color.black));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams
                    (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
            contentView.addView(view, layoutParams);

            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);



            Log.d(TAG,"custom view " + view.getClass().getName());

            if(view instanceof ViewGroup){

                ViewGroup viewGroup = (ViewGroup)view;

                for(int i = 0 ;  i< viewGroup.getChildCount();i++){
                    View child = viewGroup.getChildAt(i);
                    Log.d(TAG,"child " + child.getClass().getName());
                    Log.d(TAG,"child size " + child.getWidth() + "," + child.getHeight());
                }

            }


        }

        @Override
        public void onHideCustomView() {
            Log.d(TAG, "onHideCustomView");

            customViewCallback.onCustomViewHidden();
            contentView.removeView(customView);
            webView.setVisibility(View.VISIBLE);
            customView = null;
            customViewCallback = null;

            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }

    };


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                getSupportActionBar().hide();
            }
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                getSupportActionBar().show();
            }
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }

    }


    @Override
    public void onBackPressed() {
        if (getRequestedOrientation() == ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            return;
        }
        super.onBackPressed();
    }
}
