package com.example.administrator.novelhelper.greendaobeans.describe;


import com.example.administrator.novelhelper.greendaobeans.SentenceAttribute;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class MindDescribe  extends SentenceAttribute{
    @Id
    Long id;
    String passion;

    @Generated(hash = 1551363500)
    public MindDescribe(Long id, String passion) {
        this.id = id;
        this.passion = passion;
    }

    @Generated(hash = 2073764952)
    public MindDescribe() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassion() {
        return passion;
    }

    public void setPassion(String passion) {
        this.passion = passion;
    }
}
