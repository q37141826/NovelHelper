package com.example.administrator.novelhelper.greendaobeans.describe;

import com.example.administrator.novelhelper.greendaobeans.Describes;
import com.example.administrator.novelhelper.greendaobeans.describe.object_describe.clothes.ClothesDescribe;

import java.util.ArrayList;
import java.util.List;

public class FlowCreater {
    //流程生成器
    private String subjectName;
    private String objectName;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    //战斗流程的算法
    public static List<Describes> getFightFlow(int circleTimes, int subLevel, int obLevel) {//参数  回合数，主人公综合实力，敌方综合实力
        final String SINGPLE = "SINGPLE";
        final String NORMAL = "NORMAL";
        final String HARD = "HARD";
        final String IMPOSSOBLE = "IMPOSSOBLE";
        String type = SINGPLE;
        int describeTimes = 2;
        if (subLevel - obLevel > 1) {
            type = SINGPLE;
            describeTimes = 2;
        } else if (subLevel - obLevel > -1 && subLevel - obLevel <= 1) {
            type = NORMAL;
            describeTimes = 5;
        } else if (subLevel - obLevel > -3 && subLevel - obLevel <= -1) {
            type = HARD;
            describeTimes = 10;
        } else {
            describeTimes = 5;
            type = IMPOSSOBLE;
        }
        List<Describes> describes = new ArrayList<>();
        for (int i = 0; i < circleTimes; i++) {

        }
        ClothesDescribe clothesDescribe = new ClothesDescribe();
        describes.add(clothesDescribe);


        return describes;
    }

}
