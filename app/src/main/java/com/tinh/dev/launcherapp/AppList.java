package com.tinh.dev.launcherapp;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AppList extends AppCompatActivity {
           private PackageManager packageManager;
           private ArrayList<Item> items;
           private RecyclerView recyclerView;
           private BillAdapter billAdapter;
           private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_list);
        recyclerView =findViewById(R.id.recyclerview);
        linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        loadapps();
        Add();

    }

    public void loadapps(){

        packageManager=getPackageManager();
        items=new ArrayList<>();
        Intent i=new Intent(Intent.ACTION_MAIN,null);
        i.addCategory(Intent.CATEGORY_LAUNCHER);
        List<ResolveInfo> resolveInfos= packageManager.queryBroadcastReceivers(i,0);
        for (ResolveInfo ri : resolveInfos){
            Item item=new Item(ri.activityInfo.packageName,ri.loadLabel(packageManager),ri.loadIcon(packageManager));
            items.add(item);
            }
        billAdapter=new BillAdapter(this,items);

    }

    private void Add(){
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(billAdapter);
    }
}
