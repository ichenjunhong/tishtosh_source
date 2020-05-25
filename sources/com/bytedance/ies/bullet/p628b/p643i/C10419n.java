package com.bytedance.ies.bullet.p628b.p643i;

import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.i.n */
public class C10419n<T> implements C10385f<T> {

    /* renamed from: a */
    public boolean f27824a;

    /* renamed from: b */
    public final C10387h<T> f27825b;

    /* renamed from: c */
    public final T f27826c;

    /* renamed from: d */
    private T f27827d;

    /* renamed from: e */
    private final String f27828e;

    /* renamed from: a */
    public final String mo18454a() {
        return this.f27828e;
    }

    /* renamed from: b */
    public final T mo18457b() {
        T t = this.f27827d;
        if (t == null) {
            return this.f27826c;
        }
        return t;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Param(");
        sb.append(this.f27825b);
        sb.append("){key: ");
        sb.append(mo18454a());
        sb.append(", value: ");
        sb.append(mo18457b());
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo18456a(T t) {
        this.f27827d = t;
    }

    /* renamed from: b */
    public final <R> R mo18458b(Class<R> cls, R r) {
        C52711k.m112240b(cls, "inputType");
        C52686q b = this.f27825b.mo18464b(cls);
        if (b == null) {
            return r;
        }
        T t = this.f27827d;
        if (t != null) {
            return b.invoke(r, mo18454a(), t);
        }
        return r;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r2 == null) goto L_0x0017;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <R> void mo18455a(java.lang.Class<R> r2, R r3) {
        /*
            r1 = this;
            java.lang.String r0 = "inputType"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r0)
            com.bytedance.ies.bullet.b.i.h<T> r0 = r1.f27825b
            d.f.a.m r2 = r0.mo18461a(r2)
            if (r2 == 0) goto L_0x0017
            java.lang.String r0 = r1.mo18454a()
            java.lang.Object r2 = r2.invoke(r3, r0)
            if (r2 != 0) goto L_0x001e
        L_0x0017:
            boolean r2 = r1.f27824a
            if (r2 == 0) goto L_0x001c
            return
        L_0x001c:
            T r2 = r1.f27826c
        L_0x001e:
            r1.mo18456a(r2)
            r2 = 1
            r1.f27824a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.p628b.p643i.C10419n.mo18455a(java.lang.Class, java.lang.Object):void");
    }

    public C10419n(String str, C10387h<T> hVar, T t) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(hVar, "type");
        this.f27828e = str;
        this.f27825b = hVar;
        this.f27826c = t;
    }

    public /* synthetic */ C10419n(String str, C10387h hVar, Object obj, int i, C52707g gVar) {
        this(str, hVar, null);
    }
}
