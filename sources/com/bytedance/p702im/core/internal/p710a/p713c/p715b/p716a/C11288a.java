package com.bytedance.p702im.core.internal.p710a.p713c.p715b.p716a;

import android.database.Cursor;
import com.bytedance.p702im.core.internal.p710a.p713c.C11287b;

/* renamed from: com.bytedance.im.core.internal.a.c.b.a.a */
public final class C11288a implements C11287b {

    /* renamed from: a */
    private Cursor f30392a;

    /* renamed from: e */
    public final Object mo20995e() {
        return this.f30392a;
    }

    /* renamed from: b */
    public final int mo20990b() {
        return this.f30392a.getCount();
    }

    /* renamed from: d */
    public final boolean mo20994d() {
        return this.f30392a.moveToNext();
    }

    /* renamed from: c */
    public final boolean mo20993c() {
        return this.f30392a.moveToFirst();
    }

    /* renamed from: a */
    public final void mo20989a() {
        this.f30392a.close();
    }

    public C11288a(Cursor cursor) {
        this.f30392a = cursor;
    }

    /* renamed from: a */
    public final int mo20987a(int i) {
        return this.f30392a.getInt(i);
    }

    /* renamed from: c */
    public final String mo20992c(int i) {
        return this.f30392a.getString(i);
    }

    /* renamed from: a */
    public final int mo20988a(String str) {
        return this.f30392a.getColumnIndex(str);
    }

    /* renamed from: b */
    public final long mo20991b(int i) {
        return this.f30392a.getLong(i);
    }
}
