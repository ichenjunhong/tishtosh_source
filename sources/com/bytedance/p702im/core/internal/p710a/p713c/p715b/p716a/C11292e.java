package com.bytedance.p702im.core.internal.p710a.p713c.p715b.p716a;

import android.database.sqlite.SQLiteStatement;
import com.bytedance.p702im.core.internal.p710a.p713c.C11302f;

/* renamed from: com.bytedance.im.core.internal.a.c.b.a.e */
public final class C11292e implements C11302f {

    /* renamed from: a */
    private SQLiteStatement f30396a;

    /* renamed from: a */
    public final int mo21009a() {
        return this.f30396a.executeUpdateDelete();
    }

    /* renamed from: b */
    public final long mo21012b() {
        return this.f30396a.executeInsert();
    }

    /* renamed from: c */
    public final void mo21013c() {
        this.f30396a.close();
    }

    /* renamed from: d */
    public final void mo21014d() {
        this.f30396a.clearBindings();
    }

    public C11292e(SQLiteStatement sQLiteStatement) {
        this.f30396a = sQLiteStatement;
    }

    /* renamed from: a */
    public final void mo21010a(int i, long j) {
        this.f30396a.bindLong(i, j);
    }

    /* renamed from: a */
    public final void mo21011a(int i, String str) {
        this.f30396a.bindString(i, str);
    }
}
