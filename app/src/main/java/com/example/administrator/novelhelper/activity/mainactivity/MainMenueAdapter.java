package com.example.administrator.novelhelper.activity.mainactivity;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.novelhelper.R;
import com.example.mylibrary.myrecycler.RecyclerBaseAdapter;
import com.example.mylibrary.myrecycler.RecyclerBaseHolder;

/**
 * Created by Administrator on 2018/10/28 0028.
 */

public class MainMenueAdapter extends RecyclerBaseAdapter {


    @Override
    public int getLayoutId() {
        return R.layout.item_main;
    }

    @Override
    public Object createViewHolder(View itemView, Context context, int viewType) {
        return new Mainholder(itemView, context, this);
    }

    public class Mainholder extends RecyclerBaseHolder {
        TextView textViewItem;

        public Mainholder(View itemView, Context context, RecyclerView.Adapter adapter) {
            super(itemView, context, adapter);
            textViewItem = itemView.findViewById(R.id.textViewItem);
        }

        @Override
        public void bindHolder(int position) {
            if(mData instanceof MenueBean){
                MenueBean bean= (MenueBean) mData;
                textViewItem.setText(bean.getName());
            }
        }
    }
}
