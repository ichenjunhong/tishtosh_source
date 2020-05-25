package com.bytedance.p513c.p516c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.bytedance.c.c.a */
final class C9300a extends SQLiteOpenHelper {
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    C9300a(Context context) {
        super(context, "verifystorage.db", null, 1);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS h5_storage ( primary_key TEXT, time_stamp LONG PRIMARY KEY, content TEXT ) ");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS h5_storage ( primary_key TEXT, time_stamp LONG PRIMARY KEY, content TEXT ) ");
    }
}
