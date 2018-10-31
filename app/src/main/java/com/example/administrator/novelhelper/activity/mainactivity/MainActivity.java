package com.example.administrator.novelhelper.activity.mainactivity;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.dengpinbo.novelhelper.DaoSession;
import com.dengpinbo.novelhelper.TestUserDao;
import com.example.administrator.novelhelper.R;
import com.example.administrator.novelhelper.activity.BaseActivity;
import com.example.administrator.novelhelper.activity.greendaobeans.GreenDaoUtils;
import com.example.administrator.novelhelper.activity.greendaobeans.TestUser;
import com.example.mylibrary.myrecycler.OnRecyclerItemListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    private RecyclerView recyclerview;
    private MainMenueAdapter adapter;
    private TextView textViewReadData;
    private TestUserDao userDao;


    @Override
    protected int getLayoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {
        List<MenueBean> datas = new ArrayList<>();
        List<Intent> menuIntent = MenuName.createMenuIntent(this);
        for (int i = 0; i < MenuName.menueName.length; i++) {
            MenueBean bean = new MenueBean();
            bean.setName(MenuName.menueName[i]);
            bean.setIntent(menuIntent.get(i));
            datas.add(bean);
        }
        adapter.refreshData(datas);
        adapter.setOnItemClickListener(new OnRecyclerItemListener() {
            @Override
            public void onItemClick(View v, Object data) {
                if (data instanceof MenueBean) {
                    MenueBean bean = (MenueBean) data;
                    startActivity(bean.getIntent());
                }
            }
        });


    }

    private void creatTable() {
        DaoSession seesion = GreenDaoUtils.getSeesion(getContext());
        userDao = seesion.getTestUserDao();
    }

    @Override
    public void initView() {
        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MainMenueAdapter();
        recyclerview.setAdapter(adapter);
        textViewReadData = findViewById(R.id.textViewReadData);
        creatTable();
    }


    private void insert() {
        TestUser user = new TestUser();//如果id为null，那么数据库会为其分配自增长id
        user.setId(null);
        user.setName("呵呵");
        userDao.insert(user);
        Toast.makeText(this, "成功插入", Toast.LENGTH_SHORT).show();
    }


    public void saveData(View view) {
        insert();
    }

    public void readData(View view) {
        customSql();
//        query();
    }

    private void query() {
        List<TestUser> userList = userDao.queryBuilder()
                .where(TestUserDao.Properties.Id.notEq(1))
                .limit(10)
                .build().list();
        StringBuilder s = new StringBuilder();
        for (TestUser user : userList) {
            s.append("userId:" + user.getId() + "username:" + user.getName());
            s.append('\n');
        }
        textViewReadData.setText(s);
    }

    public void customSql() {
        List<TestUser> userList = userDao.queryBuilder()
                .where(TestUserDao.Properties.Id.notEq(-1))
                .build()
                .list();
        StringBuilder s = new StringBuilder();
        for (TestUser user : userList) {
            s.append("userId:" + user.getId() + "username:" + user.getName());
            s.append('\n');
        }
        textViewReadData.setText(s);
    }

}
