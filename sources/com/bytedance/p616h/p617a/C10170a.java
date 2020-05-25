package com.bytedance.p616h.p617a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.bytedance.h.a.a */
public final class C10170a {
    /* renamed from: a */
    public static boolean m20497a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m20498a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }
}
