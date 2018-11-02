package com.example.administrator.novelhelper.greendaobeans.describe;


import com.example.administrator.novelhelper.greendaobeans.SentenceAttribute;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

//神态描写
@Entity
public class MannerDescribe  extends SentenceAttribute {
    @Id
    Long id;
    String partName;
    String meaning;


    @Generated(hash = 905937024)
    public MannerDescribe(Long id, String partName, String meaning) {
        this.id = id;
        this.partName = partName;
        this.meaning = meaning;
    }

    @Generated(hash = 505988366)
    public MannerDescribe() {
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
