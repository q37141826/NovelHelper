package com.example.administrator.novelhelper.greendaobeans;


//这个是增加属性父类
public abstract class Describes {
    public String typeName;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        typeName = getClass().getSimpleName();
    }
}
