package com.dengpinbo.novelhelper;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.administrator.novelhelper.greendaobeans.describe.MannerDescribe;
import com.example.administrator.novelhelper.greendaobeans.describe.MindDescribe;
import com.example.administrator.novelhelper.greendaobeans.TestUser;
import com.example.administrator.novelhelper.greendaobeans.describe.ActionDescribe;
import com.example.administrator.novelhelper.greendaobeans.describe.object_describe.clothes.ClothesDescribe;
import com.example.administrator.novelhelper.greendaobeans.describe.object_describe.weapon.WeaponDescription;

import com.dengpinbo.novelhelper.MannerDescribeDao;
import com.dengpinbo.novelhelper.MindDescribeDao;
import com.dengpinbo.novelhelper.TestUserDao;
import com.dengpinbo.novelhelper.ActionDescribeDao;
import com.dengpinbo.novelhelper.ClothesDescribeDao;
import com.dengpinbo.novelhelper.WeaponDescriptionDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig mannerDescribeDaoConfig;
    private final DaoConfig mindDescribeDaoConfig;
    private final DaoConfig testUserDaoConfig;
    private final DaoConfig actionDescribeDaoConfig;
    private final DaoConfig clothesDescribeDaoConfig;
    private final DaoConfig weaponDescriptionDaoConfig;

    private final MannerDescribeDao mannerDescribeDao;
    private final MindDescribeDao mindDescribeDao;
    private final TestUserDao testUserDao;
    private final ActionDescribeDao actionDescribeDao;
    private final ClothesDescribeDao clothesDescribeDao;
    private final WeaponDescriptionDao weaponDescriptionDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        mannerDescribeDaoConfig = daoConfigMap.get(MannerDescribeDao.class).clone();
        mannerDescribeDaoConfig.initIdentityScope(type);

        mindDescribeDaoConfig = daoConfigMap.get(MindDescribeDao.class).clone();
        mindDescribeDaoConfig.initIdentityScope(type);

        testUserDaoConfig = daoConfigMap.get(TestUserDao.class).clone();
        testUserDaoConfig.initIdentityScope(type);

        actionDescribeDaoConfig = daoConfigMap.get(ActionDescribeDao.class).clone();
        actionDescribeDaoConfig.initIdentityScope(type);

        clothesDescribeDaoConfig = daoConfigMap.get(ClothesDescribeDao.class).clone();
        clothesDescribeDaoConfig.initIdentityScope(type);

        weaponDescriptionDaoConfig = daoConfigMap.get(WeaponDescriptionDao.class).clone();
        weaponDescriptionDaoConfig.initIdentityScope(type);

        mannerDescribeDao = new MannerDescribeDao(mannerDescribeDaoConfig, this);
        mindDescribeDao = new MindDescribeDao(mindDescribeDaoConfig, this);
        testUserDao = new TestUserDao(testUserDaoConfig, this);
        actionDescribeDao = new ActionDescribeDao(actionDescribeDaoConfig, this);
        clothesDescribeDao = new ClothesDescribeDao(clothesDescribeDaoConfig, this);
        weaponDescriptionDao = new WeaponDescriptionDao(weaponDescriptionDaoConfig, this);

        registerDao(MannerDescribe.class, mannerDescribeDao);
        registerDao(MindDescribe.class, mindDescribeDao);
        registerDao(TestUser.class, testUserDao);
        registerDao(ActionDescribe.class, actionDescribeDao);
        registerDao(ClothesDescribe.class, clothesDescribeDao);
        registerDao(WeaponDescription.class, weaponDescriptionDao);
    }
    
    public void clear() {
        mannerDescribeDaoConfig.clearIdentityScope();
        mindDescribeDaoConfig.clearIdentityScope();
        testUserDaoConfig.clearIdentityScope();
        actionDescribeDaoConfig.clearIdentityScope();
        clothesDescribeDaoConfig.clearIdentityScope();
        weaponDescriptionDaoConfig.clearIdentityScope();
    }

    public MannerDescribeDao getMannerDescribeDao() {
        return mannerDescribeDao;
    }

    public MindDescribeDao getMindDescribeDao() {
        return mindDescribeDao;
    }

    public TestUserDao getTestUserDao() {
        return testUserDao;
    }

    public ActionDescribeDao getActionDescribeDao() {
        return actionDescribeDao;
    }

    public ClothesDescribeDao getClothesDescribeDao() {
        return clothesDescribeDao;
    }

    public WeaponDescriptionDao getWeaponDescriptionDao() {
        return weaponDescriptionDao;
    }

}
