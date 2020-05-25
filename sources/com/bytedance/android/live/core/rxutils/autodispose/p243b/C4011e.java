package com.bytedance.android.live.core.rxutils.autodispose.p243b;

import com.bytedance.android.live.core.rxutils.autodispose.C4003ad;
import com.bytedance.android.live.core.rxutils.autodispose.C4039r;
import java.util.Comparator;
import p064c.p065a.C1687b;
import p064c.p065a.C2142f;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p077e.p081d.C1968bb;
import p064c.p065a.p090h.C2150a;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.b.e */
public final class C4011e {

    /* renamed from: a */
    private static final Comparator<Comparable<Object>> f11143a = C4014h.f11147a;

    /* renamed from: a */
    public static <E> C2142f m10130a(C4010d<E> dVar, boolean z) throws C4003ad {
        C1715j jVar;
        Object d = dVar.mo9399d();
        C4007a b = dVar.mo9397b();
        if (d != null) {
            try {
                Object apply = b.apply(d);
                C2201v a = dVar.mo9396a();
                Comparator<Comparable<Object>> comparator = null;
                if (apply instanceof Comparable) {
                    comparator = f11143a;
                }
                if (comparator != null) {
                    jVar = new C4012f(comparator, apply);
                } else {
                    jVar = new C4013g(apply);
                }
                C2201v a2 = a.mo6509a(1);
                C1745b.m6050a(jVar, "predicate is null");
                return C2150a.m6486a((C2201v<T>) new C1968bb<T>(a2, jVar)).mo6546f();
            } catch (Exception e) {
                if (!(e instanceof C4008b)) {
                    return C1687b.m5988a((Throwable) e);
                }
                C1710e a3 = C4039r.m10168a();
                if (a3 != null) {
                    try {
                        a3.accept((C4008b) e);
                        return C1687b.m5986a();
                    } catch (Exception e2) {
                        return C1687b.m5988a((Throwable) e2);
                    }
                } else {
                    throw e;
                }
            }
        } else {
            throw new C4009c();
        }
    }
}
