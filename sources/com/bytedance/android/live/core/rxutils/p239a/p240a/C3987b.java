package com.bytedance.android.live.core.rxutils.p239a.p240a;

import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p077e.p081d.C1965ba;
import p064c.p065a.p090h.C2150a;

/* renamed from: com.bytedance.android.live.core.rxutils.a.a.b */
public final class C3987b<T, R> implements C1673aa<T, T> {

    /* renamed from: a */
    private final C2201v<R> f11120a;

    /* renamed from: b */
    private final R f11121b;

    public final int hashCode() {
        return (this.f11120a.hashCode() * 31) + this.f11121b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UntilEventObservableTransformer{lifecycle=");
        sb.append(this.f11120a);
        sb.append(", event=");
        sb.append(this.f11121b);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final C2206z<T> mo6134a(C2201v<T> vVar) {
        C2201v b = this.f11120a.mo6522a((C1715j<? super T>) new C3986a<Object>(this.f11121b)).mo6527b(1);
        C1745b.m6050a(b, "other is null");
        return C2150a.m6486a((C2201v<T>) new C1965ba<T>(vVar, b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3987b bVar = (C3987b) obj;
        if (!this.f11120a.equals(bVar.f11120a)) {
            return false;
        }
        return this.f11121b.equals(bVar.f11121b);
    }

    public C3987b(C2201v<R> vVar, R r) {
        this.f11120a = vVar;
        this.f11121b = r;
    }
}
