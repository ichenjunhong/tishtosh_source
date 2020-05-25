package com.p683ss.android.ugc.trill.p2514a;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.trill.a.a */
public class C50293a extends SQLiteOpenHelper {

    /* renamed from: c */
    private static C50293a f126177c;

    /* renamed from: a */
    public SQLiteDatabase f126178a = getWritableDatabase();

    /* renamed from: b */
    public SQLiteDatabase f126179b = getReadableDatabase();

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private C50293a() {
        super(C11010c.m22280a(), "TIKTOK.db", null, 1);
    }

    /* renamed from: a */
    public static C50293a m108558a() {
        if (f126177c == null) {
            synchronized (C50293a.class) {
                if (f126177c == null) {
                    f126177c = new C50293a();
                }
            }
        }
        return f126177c;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `app_open` (\n\t`open_time`\tINTEGER UNIQUE);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `like_dialog_open` (\n\t`open_time`\tINTEGER,\n\t`version`\tINTEGER\n);");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            super.onDowngrade(sQLiteDatabase, i, i2);
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
            C10691a.m21542b(C11010c.m22280a(), (int) R.string.f7m).mo19066a();
            System.exit(0);
        }
    }
}
