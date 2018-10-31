package com.example.administrator.novelhelper.activity;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Administrator on 2018/10/28 0028.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setScreenOrentation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //将内容延伸到状态栏下面兵并且  不影响  虚拟键
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        setContentView(getLayoutRes());
        initView();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int getLayoutRes();

    //提示，参数在ActivityInfo里面
    public void setScreenOrentation(int screenOrentation) {
        setRequestedOrientation(screenOrentation);
    }
    
    
    
    
    public Context getContext(){
        return this;
    }
    
    public Activity getActivity(){
        return this;
    }
}
