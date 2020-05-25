package com.p683ss.sys.p2576a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.ss.sys.a.a */
public final class C51371a extends SQLiteOpenHelper {
    public C51371a(Context context) {
        super(context, "meta_log.db", null, 1);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS MetaLog ( _id INTEGER PRIMARY KEY , tag TEXT , time INTEGER, log TEXT  ) ");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
