package com.tinh.dev.launcherapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyHolder extends RecyclerView.ViewHolder {
    public TextView txtChinh;
    public ImageView imgView;
    public MyHolder(View itemView) {
        super(itemView);
        txtChinh=itemView.findViewById(R.id.txtChinh);
        imgView=itemView.findViewById(R.id.imgView);

    }
}
