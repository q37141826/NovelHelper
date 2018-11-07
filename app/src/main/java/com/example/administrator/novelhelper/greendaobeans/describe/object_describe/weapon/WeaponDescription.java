package com.example.administrator.novelhelper.greendaobeans.describe.object_describe.weapon;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class WeaponDescription extends WeaponType {
    @Id
    Long id;
    String name;
    String alias;

    @Generated(hash = 455269219)
    public WeaponDescription(Long id, String name, String alias) {
        this.id = id;
        this.name = name;
        this.alias = alias;
        typeName="兵器";
    }

    @Generated(hash = 572181874)
    public WeaponDescription() {
        typeName="兵器";
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

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
