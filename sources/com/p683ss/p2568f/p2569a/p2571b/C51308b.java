package com.p683ss.p2568f.p2569a.p2571b;

import java.util.ArrayList;

/* renamed from: com.ss.f.a.b.b */
public final class C51308b {

    /* renamed from: a */
    public C51309c f128218a;

    /* renamed from: b */
    public String[] f128219b;

    /* renamed from: c */
    public int f128220c;

    /* renamed from: d */
    public int f128221d;

    /* renamed from: e */
    private C51307a f128222e;

    /* renamed from: f */
    private C51310d[] f128223f;

    /* renamed from: b */
    public final void mo101848b() {
        this.f128221d = 0;
        this.f128222e = null;
        this.f128219b = null;
        this.f128218a = null;
        this.f128223f = null;
    }

    /* renamed from: a */
    public final C51310d mo101840a() {
        if (this.f128223f == null || this.f128223f.length == 0) {
            return null;
        }
        for (int i = 0; i < this.f128223f.length; i++) {
            if (this.f128223f[i].f128226a != null) {
                return this.f128223f[i];
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo101842a(C51309c cVar) {
        this.f128218a = cVar;
        this.f128221d = 0;
        this.f128220c = 2;
    }

    /* renamed from: b */
    public final C51310d mo101846b(String str) {
        if (this.f128223f == null || this.f128223f.length == 0) {
            return null;
        }
        for (int i = 0; i < this.f128223f.length; i++) {
            if (this.f128223f[i].mo101855a() == str) {
                return this.f128223f[i];
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo101843a(C51310d[] dVarArr) {
        this.f128223f = dVarArr;
        this.f128221d = 0;
        this.f128220c = 1;
        ArrayList arrayList = new ArrayList();
        for (C51310d dVar : dVarArr) {
            if (dVar.f128226a != null) {
                arrayList.add(dVar.f128226a);
            }
            if (dVar.f128227b != null) {
                arrayList.add(dVar.f128227b);
            }
        }
        this.f128219b = new String[arrayList.size()];
        arrayList.toArray(this.f128219b);
    }

    /* renamed from: a */
    public final boolean mo101844a(int i) {
        if (this.f128218a == null) {
            return false;
        }
        return this.f128218a.mo101851a(1);
    }

    /* renamed from: a */
    public final boolean mo101845a(String str) {
        if (this.f128220c == 2 || this.f128218a != null) {
            return this.f128218a.mo101852a(str);
        }
        return false;
    }

    /* renamed from: b */
    public final String mo101847b(String str, String str2, String str3) {
        if (this.f128218a == null) {
            return null;
        }
        return this.f128218a.mo101854b(str, str2, str3);
    }

    /* renamed from: a */
    public final String mo101841a(String str, String str2, String str3) {
        if (this.f128220c != 2 || this.f128218a == null) {
            return null;
        }
        return this.f128218a.mo101850a(str, str2, str3);
    }
}
