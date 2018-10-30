package com.example.administrator.novelhelper.activity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2018/10/28 0028.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setScreenOrentation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }
    //提示，参数在ActivityInfo里面
    public void setScreenOrentation(int screenOrentation) {
        setRequestedOrientation(screenOrentation);
    }
}
