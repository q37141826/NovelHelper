package com.example.administrator.novelhelper.greendaobeans;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Administrator on 2018/10/30 0030.
 */
@Entity
public class TestUser {
    @Id
    private Long id;
    private String name;

 

    public TestUser() {
    }



    @Generated(hash = 1666760071)
    public TestUser(Long id, String name) {
        this.id = id;
        this.name = name;
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
