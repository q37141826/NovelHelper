package com.example.administrator.novelhelper.greendaobeans.describe.object_describe.clothes;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

//服饰描写
@Entity
public class ClothesDescribe extends ClothesPart{
    @Id
    Long id;
    String color;
    String alias;
    String material;


    @Generated(hash = 358355412)
    public ClothesDescribe(Long id, String color, String alias, String material) {
        this.id = id;
        this.color = color;
        this.alias = alias;
        this.material = material;
    }

    @Generated(hash = 162041769)
    public ClothesDescribe() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
