package com.p683ss.android.ugc.aweme.feed.netdetector.p1734a;

import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.netdetector.a.c */
public final class C30547c {
    /* renamed from: a */
    public static final <T> T m71527a(C30546b bVar, C52670a<? extends T> aVar) throws Exception {
        C52711k.m112240b(aVar, "block");
        if (bVar != null) {
            try {
                bVar.mo62737a();
            } catch (Throwable th) {
                if (th instanceof C30548d) {
                    throw ((C30548d) th).getRealThrowable();
                }
                throw th;
            }
        }
        T invoke = aVar.invoke();
        if (bVar != null) {
            bVar.mo62740b();
        }
        return invoke;
    }
}
