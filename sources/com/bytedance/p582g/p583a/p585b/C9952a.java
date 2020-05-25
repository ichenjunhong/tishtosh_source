package com.bytedance.p582g.p583a.p585b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.p582g.p583a.p592d.C10003g;

/* renamed from: com.bytedance.g.a.b.a */
public class C9952a extends SQLiteOpenHelper {

    /* renamed from: a */
    private static C9952a f27034a;

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE monitor_log ( _id Integer PRIMARY KEY AUTOINCREMENT, aid Integer, type VARCHAR, type2 VARCHAR, time Integer, data TEXT, data2 TEXT, data3 TEXT  )");
            sQLiteDatabase.execSQL("CREATE TABLE queue ( _id INTEGER PRIMARY KEY AUTOINCREMENT, value BLOB, type TEXT, timestamp INTEGER, retry_count INTEGER, retry_time INTEGER )");
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static C9952a m20002a(Context context) {
        if (f27034a == null) {
            synchronized (C9952a.class) {
                if (f27034a == null) {
                    String a = C10003g.m20115a(context);
                    StringBuilder sb = new StringBuilder();
                    sb.append(a);
                    sb.append("sdkmon_v2.db");
                    f27034a = new C9952a(context, sb.toString());
                }
            }
        }
        return f27034a;
    }

    private C9952a(Context context, String str) {
        super(context, str, null, 1);
    }
}
