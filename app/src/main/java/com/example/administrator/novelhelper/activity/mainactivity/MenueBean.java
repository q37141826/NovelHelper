package com.example.administrator.novelhelper.activity.mainactivity;

import android.content.Intent;

/**
 * Created by Administrator on 2018/10/28 0028.
 */

public class MenueBean {
    String name;
    Intent intent;

    public MenueBean() {
    }

    public MenueBean(String name, Intent intent) {
        this.name = name;
        this.intent = intent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Intent getIntent() {
        return intent;
    }

    public void setIntent(Intent intent) {
        this.intent = intent;
    }
}
