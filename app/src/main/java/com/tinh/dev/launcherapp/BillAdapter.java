package com.tinh.dev.launcherapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class BillAdapter extends RecyclerView.Adapter<MyHolder> {

    private Context context;
    private ArrayList<Item> arrayList;

    public BillAdapter(Context context, ArrayList<Item> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }
    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.cardview,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
            Item item=arrayList.get(position);
            holder.imgView.setImageDrawable(item.getIcon1());
            holder.txtChinh.setText(item.getName1());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
