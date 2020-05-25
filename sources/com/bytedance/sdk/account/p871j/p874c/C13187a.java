package com.bytedance.sdk.account.p871j.p874c;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.bytedance.sdk.account.j.c.a */
public final class C13187a extends SQLiteOpenHelper {
    public C13187a(Context context) {
        super(context, "account_db", null, 2);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS login_info (time integer primary key , type integer , info text , uid integer , avatar_url text , screen_name text , platform_avatar_url text, platform_screen_name text,sec_uid text,ext text);");
        } catch (SQLException unused) {
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 2) {
            sQLiteDatabase.execSQL("alter TABLE login_info add COLUMN sec_uid text ");
            sQLiteDatabase.execSQL("alter TABLE login_info add COLUMN ext text ");
        }
    }
}
