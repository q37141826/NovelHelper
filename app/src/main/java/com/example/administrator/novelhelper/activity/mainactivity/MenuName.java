package com.example.administrator.novelhelper.activity.mainactivity;

import android.content.Context;
import android.content.Intent;

import com.example.administrator.novelhelper.activity.fight_flow.FightFlowActvity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/10/28 0028.
 */

public class MenuName {

    public static final String menueName[]={"战斗流程"};
    public static final Class activitys[]={FightFlowActvity.class};
    public static List<Intent> createMenuIntent (Context context){
        List<Intent> intentList=new ArrayList<>();
        for (int i = 0; i <menueName.length ; i++) {
            intentList.add(new Intent(context,activitys[i]));
        }
        return intentList;
    }


}
