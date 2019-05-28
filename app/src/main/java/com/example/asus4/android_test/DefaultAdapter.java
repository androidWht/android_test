package com.example.asus4.android_test;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TextView;

public class DefaultAdapter extends RecyclerView.Adapter {

    private final int count;

    public DefaultAdapter(int count){
        this.count = count;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        TextView tv = new TextView(parent.getContext());
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,100);
        tv.setLayoutParams(params);
        tv.setGravity(Gravity.CENTER);
        tv.setText("Test Test Test");
        tv.setTextColor(0xff000000);
        return new RecyclerView.ViewHolder(tv) {};
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return count;
    }


}
