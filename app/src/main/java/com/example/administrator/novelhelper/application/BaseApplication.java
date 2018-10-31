package com.example.administrator.novelhelper.application;

import android.content.Context;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

public class BaseApplication  extends MultiDexApplication {
    private static BaseApplication app;
    private static Context mContext;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
    public static BaseApplication getApp() {
        return app;
    }

    public static Context getContext() {
        return mContext;
    }

}
