package com.example.administrator.novelhelper.greendaobeans.describe.object_describe.effectivedescribe;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.administrator.novelhelper.greendaobeans.Describes;

public class EffectDescribe extends Describes implements Parcelable {
    private String id;
    private String object_name;
    private String skill_name;
    private String level;
    private String time;
    private String describe;

    public static final String BEFORE = "before";
    public static final String IN_LONG = "in_long";
    public static final String IN_SHORT = "in_short";
    public static final String FINALLY = "finally";


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject_name() {
        return object_name;
    }

    public void setObject_name(String object_name) {
        this.object_name = object_name;
    }

    public String getSkill_name() {
        return skill_name;
    }

    public void setSkill_name(String skill_name) {
        this.skill_name = skill_name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.object_name);
        dest.writeString(this.skill_name);
        dest.writeString(this.level);
        dest.writeString(this.time);
        dest.writeString(this.describe);
    }

    public EffectDescribe() {
        typeName="特效描写";
    }

    protected EffectDescribe(Parcel in) {
        this.id = in.readString();
        this.object_name = in.readString();
        this.skill_name = in.readString();
        this.level = in.readString();
        this.time = in.readString();
        this.describe = in.readString();
        typeName="特效描写";
    }

    public static final Parcelable.Creator<EffectDescribe> CREATOR = new Parcelable.Creator<EffectDescribe>() {
        @Override
        public EffectDescribe createFromParcel(Parcel source) {
            return new EffectDescribe(source);
        }

        @Override
        public EffectDescribe[] newArray(int size) {
            return new EffectDescribe[size];
        }
    };
}
