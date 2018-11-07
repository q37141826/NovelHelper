package com.example.administrator.novelhelper.greendaobeans.describe;


import com.example.administrator.novelhelper.greendaobeans.Describes;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class ActionDescribe  extends Describes {
    @Id
    Long id;
    String name;

    @Generated(hash = 1014792179)
    public ActionDescribe(Long id, String name) {
        this.id = id;
        this.name = name;
        typeName="动作描写";
    }

    @Generated(hash = 2111919555)
    public ActionDescribe() {
        typeName="动作描写";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
