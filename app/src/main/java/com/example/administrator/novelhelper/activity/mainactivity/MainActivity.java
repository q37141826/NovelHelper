package com.example.administrator.novelhelper.activity.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.administrator.novelhelper.R;
import com.example.administrator.novelhelper.activity.BaseActivity;
import com.example.mylibrary.myrecycler.OnRecyclerItemListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    private RecyclerView recyclerview;
    private MainMenueAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MainMenueAdapter();
        recyclerview.setAdapter(adapter);
        List<MenueBean>  datas=new ArrayList<>();
        List<Intent> menuIntent = MenuName.createMenuIntent(this);
        for (int i = 0; i < MenuName.menueName.length; i++) {
            MenueBean bean=new MenueBean();
            bean.setName(MenuName.menueName[i]);
            bean.setIntent(menuIntent.get(i));
            datas.add(bean);
        }
        adapter.refreshData(datas);
        adapter.setOnItemClickListener(new OnRecyclerItemListener() {
            @Override
            public void onItemClick(View v, Object data) {
                if(data instanceof MenueBean){
                    MenueBean bean= (MenueBean) data;
                    startActivity(bean.getIntent());
                }
            }
        });

    }
}
