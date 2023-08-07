package com.example.btl_adr;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class database extends SQLiteOpenHelper {
    public database( Context context) {
        super(context, "huys", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE user(taikhoan text PRIMARY KEY, matkhau text, hoten text)";
        db.execSQL(sql);
        sql = "INSERT INTO user VALUES('huy', 'huy', 'PHAM GIA HUY')";
        db.execSQL(sql);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS user");
        onCreate(db);
    }
}
