package com.example.administrator.novelhelper.activity.greendaobeans;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Administrator on 2018/10/30 0030.
 */
@Entity
public class TestUser {
    @Id
    private long id;
    private String name;

    @Generated(hash = 2101195982)
    public TestUser(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Generated(hash = 925009630)
    public TestUser() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
