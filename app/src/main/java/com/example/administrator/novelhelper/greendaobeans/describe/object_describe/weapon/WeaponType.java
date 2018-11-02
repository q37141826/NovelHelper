package com.example.administrator.novelhelper.greendaobeans.describe.object_describe.weapon;

import com.example.administrator.novelhelper.greendaobeans.Describes;

public abstract class WeaponType extends Describes {
    String weaponType;

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }
}
