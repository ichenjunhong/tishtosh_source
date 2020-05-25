package com.bytedance.p513c.p516c;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;

/* renamed from: com.bytedance.c.c.b */
public class C9301b {

    /* renamed from: b */
    private static final String f25468b = "b";

    /* renamed from: c */
    private static volatile C9301b f25469c;

    /* renamed from: e */
    private static long f25470e;

    /* renamed from: a */
    public SQLiteDatabase f25471a;

    /* renamed from: d */
    private C9300a f25472d;

    private C9301b() {
    }

    /* renamed from: a */
    public static C9301b m18436a() {
        if (f25469c == null) {
            synchronized (C9301b.class) {
                if (f25469c == null) {
                    f25469c = new C9301b();
                }
            }
        }
        return f25469c;
    }

    /* renamed from: c */
    private static long m18437c() {
        long currentTimeMillis = System.currentTimeMillis();
        if (f25470e >= currentTimeMillis) {
            f25470e++;
        } else {
            f25470e = currentTimeMillis;
        }
        return f25470e;
    }

    /* renamed from: b */
    public void mo16911b() {
        if (this.f25471a == null) {
            synchronized (C9301b.class) {
                if (this.f25471a == null) {
                    try {
                        this.f25471a = this.f25472d.getWritableDatabase();
                    } catch (SQLException unused) {
                        this.f25471a = null;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public int mo16907a(long j) {
        int i;
        mo16911b();
        if (this.f25471a == null || !this.f25471a.isOpen()) {
            return -1;
        }
        String str = "time_stamp=?";
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        try {
            i = this.f25471a.delete("h5_storage", str, new String[]{sb.toString()});
        } catch (SQLException unused) {
            i = 0;
        }
        return i;
    }

    /* renamed from: a */
    public final long mo16908a(String str) {
        mo16911b();
        new StringBuilder("insertEvent : ").append(str);
        long j = -1;
        if (this.f25471a == null || !this.f25471a.isOpen()) {
            return -1;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("primary_key", "event");
        contentValues.put("time_stamp", Long.valueOf(m18437c()));
        contentValues.put(C42311c.f106865i, str);
        try {
            j = this.f25471a.insert("h5_storage", null, contentValues);
        } catch (SQLException unused) {
        }
        return j;
    }

    /* renamed from: a */
    public final synchronized void mo16910a(Context context) {
        if (context != null) {
            if (this.f25472d == null) {
                this.f25472d = new C9300a(context);
            }
        }
    }

    /* renamed from: a */
    public long mo16909a(String str, String str2) {
        long j;
        mo16911b();
        new StringBuilder("updateOrInsertSingleData : ").append(str);
        new StringBuilder("updateOrInsertSingleData : ").append(str2);
        if (this.f25471a == null || !this.f25471a.isOpen()) {
            return -1;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("primary_key", str);
        contentValues.put("time_stamp", Long.valueOf(m18437c()));
        contentValues.put(C42311c.f106865i, str2);
        String str3 = "primary_key=?";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        try {
            long update = (long) this.f25471a.update("h5_storage", contentValues, str3, new String[]{sb.toString()});
            if (update == 0) {
                try {
                    j = this.f25471a.insert("h5_storage", null, contentValues);
                } catch (SQLException unused) {
                    j = update;
                    new StringBuilder("updateOrInsertSingleData fail: ").append(str);
                    return j;
                }
            } else {
                j = update;
            }
        } catch (SQLException unused2) {
            j = 0;
            new StringBuilder("updateOrInsertSingleData fail: ").append(str);
            return j;
        }
        return j;
    }
}
