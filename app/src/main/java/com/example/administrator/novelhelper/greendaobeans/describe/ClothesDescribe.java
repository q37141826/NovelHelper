package com.example.administrator.novelhelper.greendaobeans.describe;

import com.example.administrator.novelhelper.greendaobeans.SentenceAttribute;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

//服饰描写
@Entity
public class ClothesDescribe extends SentenceAttribute implements Describe {
    @Id
    Long id;
    String partName;
    String color;
    String alias;
    String material;

    @Generated(hash = 1991480921)
    public ClothesDescribe(Long id, String partName, String color, String alias,
            String material) {
        this.id = id;
        this.partName = partName;
        this.color = color;
        this.alias = alias;
        this.material = material;
    }

    @Generated(hash = 162041769)
    public ClothesDescribe() {
    }

    @Override
    public void setTypeName(String typeName) {
        this.typeName=getClass().getSimpleName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
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
