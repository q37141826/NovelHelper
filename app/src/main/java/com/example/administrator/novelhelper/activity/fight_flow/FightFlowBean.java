package com.example.administrator.novelhelper.activity.fight_flow;

import com.example.administrator.novelhelper.greendaobeans.Describes;

//战斗流程条目
public class FightFlowBean {

    String text;
    Describes describes;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Describes getDescribes() {
        return describes;
    }

    public void setDescribes(Describes describes) {
        this.describes = describes;
    }
}
