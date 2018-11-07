package com.example.administrator.novelhelper.activity.fight_flow;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.novelhelper.R;
import com.example.administrator.novelhelper.activity.TitleActivity;
import com.example.administrator.novelhelper.greendaobeans.describe.FlowCreater;
import com.example.mylibrary.myrecycler.RecyclerBaseAdapter;
import com.example.mylibrary.myrecycler.RecyclerBaseHolder;
import com.example.mylibrary.utils.ExcelReaderUtils;

import java.util.List;

public class FightFlowActvity extends TitleActivity {


    private RecyclerView recyclerviewFightFlow;
    private FightFlowAdapter adapter;
    private EditText editSubName;
    private EditText editObName;

    @Override
    protected void initData() {
        ExcelReaderUtils.readExcelFile(getContext(), "effect.xls", new ExcelReaderUtils.Listenner() {
            @Override
            public void readOk(List<List> data) {

            }
        });
        FlowCreater creater = new FlowCreater();
        creater.setObjectName(editObName.getText().toString().trim());
        creater.setSubjectName(editSubName.getText().toString().trim());


    }

    @Override
    protected void initView() {

    }

    @Override
    protected void onInitViewNew() {
        recyclerviewFightFlow = findViewById(R.id.recyclerviewFightFlow);
        adapter = new FightFlowAdapter();
        recyclerviewFightFlow.setLayoutManager(new LinearLayoutManager(this));
        recyclerviewFightFlow.setAdapter(adapter);
        editSubName = findViewById(R.id.editSubName);
        editObName = findViewById(R.id.editObName);
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.activity_fight_flow;
    }

    @Override
    public void onClick(View v) {

    }


    public class FightFlowAdapter extends RecyclerBaseAdapter<FightFlowBean, FightFlowAdapter.FightFlowHolder> {
        @Override
        public int getLayoutId() {
            return R.layout.item_fight_flow;
        }

        @Override
        public FightFlowHolder createViewHolder(View itemView, Context context, int viewType) {
            return new FightFlowHolder(itemView, context, this);
        }


        public class FightFlowHolder extends RecyclerBaseHolder<FightFlowBean> {
            TextView textViewFightFlowItem;

            public FightFlowHolder(View itemView, Context context, RecyclerView.Adapter adapter) {
                super(itemView, context, adapter);
                textViewFightFlowItem = itemView.findViewById(R.id.textViewFightFlowItem);
            }

            @Override
            public void bindHolder(int position) {
                textViewFightFlowItem.setText(mData.getText());
            }
        }
    }


}
