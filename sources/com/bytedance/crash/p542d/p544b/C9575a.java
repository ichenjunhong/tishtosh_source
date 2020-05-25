package com.bytedance.crash.p542d.p544b;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.crash.C9577e;
import java.util.HashMap;

/* renamed from: com.bytedance.crash.d.b.a */
public abstract class C9575a<T> {

    /* renamed from: a */
    protected final String f26115a = "_id";

    /* renamed from: b */
    protected final String f26116b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract ContentValues mo17373a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract HashMap<String, String> mo17374a();

    protected C9575a(String str) {
        this.f26116b = str;
    }

    /* renamed from: a */
    public final void mo17375a(SQLiteDatabase sQLiteDatabase) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE ");
            sb.append(this.f26116b);
            sb.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
            HashMap a = mo17374a();
            for (String str : a.keySet()) {
                sb.append(str);
                sb.append(" ");
                sb.append((String) a.get(str));
                sb.append(",");
            }
            sb.delete(sb.length() - 1, sb.length());
            sb.append(")");
            sQLiteDatabase.execSQL(sb.toString());
        } catch (Throwable th) {
            C9577e.m18999a().mo17384a("NPTH_CATCH", th);
        }
    }

    /* renamed from: a */
    public void mo17376a(SQLiteDatabase sQLiteDatabase, T t) {
        if (!(sQLiteDatabase == null || t == null)) {
            try {
                sQLiteDatabase.insert(this.f26116b, null, mo17373a(t));
            } catch (Throwable unused) {
            }
        }
    }
}
