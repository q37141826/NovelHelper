package com.dengpinbo.novelhelper;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import com.example.administrator.novelhelper.greendaobeans.describe.object_describe.clothes.ClothesDescribe;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CLOTHES_DESCRIBE".
*/
public class ClothesDescribeDao extends AbstractDao<ClothesDescribe, Long> {

    public static final String TABLENAME = "CLOTHES_DESCRIBE";

    /**
     * Properties of entity ClothesDescribe.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Color = new Property(1, String.class, "color", false, "COLOR");
        public final static Property Alias = new Property(2, String.class, "alias", false, "ALIAS");
        public final static Property Material = new Property(3, String.class, "material", false, "MATERIAL");
    }


    public ClothesDescribeDao(DaoConfig config) {
        super(config);
    }
    
    public ClothesDescribeDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CLOTHES_DESCRIBE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"COLOR\" TEXT," + // 1: color
                "\"ALIAS\" TEXT," + // 2: alias
                "\"MATERIAL\" TEXT);"); // 3: material
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CLOTHES_DESCRIBE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, ClothesDescribe entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String color = entity.getColor();
        if (color != null) {
            stmt.bindString(2, color);
        }
 
        String alias = entity.getAlias();
        if (alias != null) {
            stmt.bindString(3, alias);
        }
 
        String material = entity.getMaterial();
        if (material != null) {
            stmt.bindString(4, material);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, ClothesDescribe entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String color = entity.getColor();
        if (color != null) {
            stmt.bindString(2, color);
        }
 
        String alias = entity.getAlias();
        if (alias != null) {
            stmt.bindString(3, alias);
        }
 
        String material = entity.getMaterial();
        if (material != null) {
            stmt.bindString(4, material);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public ClothesDescribe readEntity(Cursor cursor, int offset) {
        ClothesDescribe entity = new ClothesDescribe( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // color
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // alias
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // material
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, ClothesDescribe entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setColor(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setAlias(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setMaterial(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(ClothesDescribe entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(ClothesDescribe entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(ClothesDescribe entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}