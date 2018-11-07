package com.example.administrator.novelhelper.greendaobeans.describe;


import com.example.administrator.novelhelper.greendaobeans.Describes;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

//神态描写
@Entity
public class MannerDescribe  extends Describes {
    @Id
    Long id;
    String partName;
    String meaning;


    @Generated(hash = 905937024)
    public MannerDescribe(Long id, String partName, String meaning) {
        this.id = id;
        this.partName = partName;
        this.meaning = meaning;
        typeName="神态描写";

    }

    @Generated(hash = 505988366)
    public MannerDescribe() {
        typeName="神态描写";
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

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
}
