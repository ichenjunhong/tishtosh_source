package com.bytedance.p702im.core.internal.p710a.p713c.p715b.p717b;

import android.content.ContentValues;
import com.bytedance.p702im.core.internal.p710a.p713c.C11287b;
import com.bytedance.p702im.core.internal.p710a.p713c.C11299d;
import com.bytedance.p702im.core.internal.p710a.p713c.C11302f;
import com.tencent.wcdb.C51782l;
import com.tencent.wcdb.database.SQLiteDatabase;

/* renamed from: com.bytedance.im.core.internal.a.c.b.b.c */
public final class C11295c implements C11299d {

    /* renamed from: a */
    public SQLiteDatabase f30399a;

    /* renamed from: b */
    public final void mo21003b() {
        this.f30399a.close();
    }

    /* renamed from: c */
    public final boolean mo21004c() {
        return this.f30399a.mo107192j();
    }

    /* renamed from: d */
    public final void mo21005d() {
        this.f30399a.mo107189g();
    }

    /* renamed from: e */
    public final void mo21006e() {
        this.f30399a.mo107191i();
    }

    /* renamed from: f */
    public final void mo21007f() {
        this.f30399a.mo107190h();
    }

    /* renamed from: a */
    public final boolean mo21001a() {
        return this.f30399a.mo107196n();
    }

    public C11295c(SQLiteDatabase sQLiteDatabase) {
        this.f30399a = sQLiteDatabase;
    }

    /* renamed from: b */
    public final C11302f mo21002b(String str) throws C51782l {
        return new C11297e(this.f30399a.mo107180a(str));
    }

    /* renamed from: a */
    public final void mo21000a(String str) throws C51782l {
        this.f30399a.mo107186b(str);
    }

    /* renamed from: a */
    public final C11287b mo20999a(String str, String[] strArr) {
        return new C11293a(this.f30399a.mo107181a(str, (Object[]) strArr));
    }

    /* renamed from: a */
    public final int mo20997a(String str, String str2, String[] strArr) {
        return this.f30399a.mo107177a(str, str2, strArr);
    }

    /* renamed from: a */
    public final long mo20998a(String str, String str2, ContentValues contentValues) {
        return this.f30399a.mo107178a(str, str2, contentValues);
    }

    /* renamed from: a */
    public final int mo20996a(String str, ContentValues contentValues, String str2, String[] strArr) {
        return this.f30399a.mo107176a(str, contentValues, str2, strArr, 0);
    }
}
