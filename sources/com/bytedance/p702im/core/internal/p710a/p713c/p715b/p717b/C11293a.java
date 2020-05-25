package com.bytedance.p702im.core.internal.p710a.p713c.p715b.p717b;

import com.bytedance.p702im.core.internal.p710a.p713c.C11287b;
import com.tencent.wcdb.C51775e;

/* renamed from: com.bytedance.im.core.internal.a.c.b.b.a */
public final class C11293a implements C11287b {

    /* renamed from: a */
    private C51775e f30397a;

    /* renamed from: e */
    public final Object mo20995e() {
        return this.f30397a;
    }

    /* renamed from: b */
    public final int mo20990b() {
        return this.f30397a.getCount();
    }

    /* renamed from: d */
    public final boolean mo20994d() {
        return this.f30397a.moveToNext();
    }

    /* renamed from: c */
    public final boolean mo20993c() {
        return this.f30397a.moveToFirst();
    }

    /* renamed from: a */
    public final void mo20989a() {
        this.f30397a.close();
    }

    public C11293a(C51775e eVar) {
        this.f30397a = eVar;
    }

    /* renamed from: a */
    public final int mo20987a(int i) {
        return this.f30397a.getInt(i);
    }

    /* renamed from: c */
    public final String mo20992c(int i) {
        return this.f30397a.getString(i);
    }

    /* renamed from: a */
    public final int mo20988a(String str) {
        return this.f30397a.getColumnIndex(str);
    }

    /* renamed from: b */
    public final long mo20991b(int i) {
        return this.f30397a.getLong(i);
    }
}
