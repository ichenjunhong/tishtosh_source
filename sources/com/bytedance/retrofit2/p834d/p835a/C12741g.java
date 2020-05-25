package com.bytedance.retrofit2.p834d.p835a;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12725c;
import java.lang.reflect.Type;
import p064c.p065a.C1663a;
import p064c.p065a.C1675ac;
import p064c.p065a.C2201v;

/* renamed from: com.bytedance.retrofit2.d.a.g */
final class C12741g implements C12725c<Object> {

    /* renamed from: a */
    private final Type f33373a;

    /* renamed from: b */
    private final C1675ac f33374b;

    /* renamed from: c */
    private final boolean f33375c;

    /* renamed from: d */
    private final boolean f33376d;

    /* renamed from: e */
    private final boolean f33377e;

    /* renamed from: f */
    private final boolean f33378f;

    /* renamed from: g */
    private final boolean f33379g;

    /* renamed from: h */
    private final boolean f33380h;

    /* renamed from: i */
    private final boolean f33381i;

    /* renamed from: a */
    public final Type mo23897a() {
        return this.f33373a;
    }

    /* renamed from: a */
    public final <R> Object mo23896a(C12690b<R> bVar) {
        C2201v vVar;
        C2201v vVar2;
        if (this.f33375c) {
            vVar = new C12733b(bVar);
        } else {
            vVar = new C12735c(bVar);
        }
        if (this.f33376d) {
            vVar2 = new C12739f(vVar);
        } else if (this.f33377e) {
            vVar2 = new C12731a(vVar);
        } else {
            vVar2 = vVar;
        }
        if (this.f33374b != null) {
            vVar2 = vVar2.mo6529b(this.f33374b);
        }
        if (this.f33378f) {
            return vVar2.mo6508a(C1663a.LATEST);
        }
        if (this.f33379g) {
            return vVar2.mo6550i();
        }
        if (this.f33380h) {
            return vVar2.mo6549h();
        }
        if (this.f33381i) {
            return vVar2.mo6546f();
        }
        return vVar2;
    }

    C12741g(Type type, C1675ac acVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f33373a = type;
        this.f33374b = acVar;
        this.f33375c = z;
        this.f33376d = z2;
        this.f33377e = z3;
        this.f33378f = z4;
        this.f33379g = z5;
        this.f33380h = z6;
        this.f33381i = z7;
    }
}
