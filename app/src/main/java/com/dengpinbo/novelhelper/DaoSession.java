package com.dengpinbo.novelhelper;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.administrator.novelhelper.greendaobeans.describe.ClothesDescribe;
import com.example.administrator.novelhelper.greendaobeans.describe.MannerDescribe;
import com.example.administrator.novelhelper.greendaobeans.describe.MindDescribe;
import com.example.administrator.novelhelper.greendaobeans.TestUser;

import com.dengpinbo.novelhelper.ClothesDescribeDao;
import com.dengpinbo.novelhelper.MannerDescribeDao;
import com.dengpinbo.novelhelper.MindDescribeDao;
import com.dengpinbo.novelhelper.TestUserDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig clothesDescribeDaoConfig;
    private final DaoConfig mannerDescribeDaoConfig;
    private final DaoConfig mindDescribeDaoConfig;
    private final DaoConfig testUserDaoConfig;

    private final ClothesDescribeDao clothesDescribeDao;
    private final MannerDescribeDao mannerDescribeDao;
    private final MindDescribeDao mindDescribeDao;
    private final TestUserDao testUserDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        clothesDescribeDaoConfig = daoConfigMap.get(ClothesDescribeDao.class).clone();
        clothesDescribeDaoConfig.initIdentityScope(type);

        mannerDescribeDaoConfig = daoConfigMap.get(MannerDescribeDao.class).clone();
        mannerDescribeDaoConfig.initIdentityScope(type);

        mindDescribeDaoConfig = daoConfigMap.get(MindDescribeDao.class).clone();
        mindDescribeDaoConfig.initIdentityScope(type);

        testUserDaoConfig = daoConfigMap.get(TestUserDao.class).clone();
        testUserDaoConfig.initIdentityScope(type);

        clothesDescribeDao = new ClothesDescribeDao(clothesDescribeDaoConfig, this);
        mannerDescribeDao = new MannerDescribeDao(mannerDescribeDaoConfig, this);
        mindDescribeDao = new MindDescribeDao(mindDescribeDaoConfig, this);
        testUserDao = new TestUserDao(testUserDaoConfig, this);

        registerDao(ClothesDescribe.class, clothesDescribeDao);
        registerDao(MannerDescribe.class, mannerDescribeDao);
        registerDao(MindDescribe.class, mindDescribeDao);
        registerDao(TestUser.class, testUserDao);
    }
    
    public void clear() {
        clothesDescribeDaoConfig.clearIdentityScope();
        mannerDescribeDaoConfig.clearIdentityScope();
        mindDescribeDaoConfig.clearIdentityScope();
        testUserDaoConfig.clearIdentityScope();
    }

    public ClothesDescribeDao getClothesDescribeDao() {
        return clothesDescribeDao;
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

}
