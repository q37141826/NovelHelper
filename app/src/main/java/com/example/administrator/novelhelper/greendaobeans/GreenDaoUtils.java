package com.example.administrator.novelhelper.greendaobeans;

import android.content.Context;

import com.dengpinbo.novelhelper.DaoMaster;
import com.dengpinbo.novelhelper.DaoSession;

public class GreenDaoUtils {

    public static DaoSession getSeesion(Context context){
        //创建一个数据库，名字为"wesker"
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(context, "wesker", null);
        //一个DaoMaster就代表着一个数据库的连接；
        DaoMaster mDaoMaster = new DaoMaster(devOpenHelper.getWritableDatabase());
        // DaoSession可以让我们使用一些Entity的基本操作和获取Dao操作类，
        // DaoSession可以创建多个，每一个都是属于同一个数据库连接的
        DaoSession mDaoSession = mDaoMaster.newSession();
        return mDaoSession;
    }



}
