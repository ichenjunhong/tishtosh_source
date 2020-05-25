package com.bytedance.crash.p542d;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.crash.p542d.p544b.C9576b;

/* renamed from: com.bytedance.crash.d.b */
public final class C9574b extends SQLiteOpenHelper {
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public C9574b(Context context) {
        super(context, "npth_log.db", null, 1);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        new C9576b().mo17375a(sQLiteDatabase);
    }
}
