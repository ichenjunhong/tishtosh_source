package com.bytedance.crash.p542d.p544b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.crash.p542d.p543a.C9573a;
import java.util.HashMap;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.bytedance.crash.d.b.b */
public final class C9576b extends C9575a<C9573a> {
    public C9576b() {
        super("duplicatelog");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<String, String> mo17374a() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(LeakCanaryFileProvider.f132050j, "TEXT");
        hashMap.put("insert_time", "INTEGER");
        hashMap.put("ext1", "TEXT");
        hashMap.put("ext2", "TEXT");
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ ContentValues mo17373a(Object obj) {
        C9573a aVar = (C9573a) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put(LeakCanaryFileProvider.f132050j, aVar.f26113a);
        contentValues.put("insert_time", Long.valueOf(aVar.f26114b));
        return contentValues;
    }

    /* renamed from: a */
    public final void mo17376a(SQLiteDatabase sQLiteDatabase, C9573a aVar) {
        if (aVar != null && !mo17378a(sQLiteDatabase, aVar.f26113a)) {
            super.mo17376a(sQLiteDatabase, aVar);
            try {
                StringBuilder sb = new StringBuilder("delete from ");
                sb.append(this.f26116b);
                sb.append(" where _id");
                sb.append(" in (select _id");
                sb.append(" from ");
                sb.append(this.f26116b);
                sb.append(" order by insert_time");
                sb.append(" desc limit 1000 offset 500");
                sb.append(")");
                sQLiteDatabase.execSQL(sb.toString());
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final boolean mo17378a(SQLiteDatabase sQLiteDatabase, String str) {
        int i;
        if (sQLiteDatabase == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            Cursor query = sQLiteDatabase2.query(this.f26116b, null, "path=?", new String[]{str}, null, null, null);
            i = query.getCount();
            try {
                query.close();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            i = 0;
        }
        if (i > 0) {
            return true;
        }
        return false;
    }
}
