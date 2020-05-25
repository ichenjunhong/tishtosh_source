package com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1849a;

import p064c.p065a.C2204x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.a.a */
public final class C34406a {
    /* renamed from: a */
    private static <T> void m78355a(C2204x<T> xVar) {
        C52711k.m112240b(xVar, "$this$safeOnComplete");
        if (xVar.isDisposed()) {
            xVar = null;
        }
        if (xVar != null) {
            xVar.mo6273a();
        }
    }

    /* renamed from: a */
    public static final <T> void m78356a(C2204x<T> xVar, T t) {
        C52711k.m112240b(xVar, "$this$safeOnSingleNext");
        m78358b(xVar, t);
        m78355a(xVar);
    }

    /* renamed from: b */
    private static <T> void m78358b(C2204x<T> xVar, T t) {
        C52711k.m112240b(xVar, "$this$safeOnNext");
        if (xVar.isDisposed()) {
            xVar = null;
        }
        if (xVar != null) {
            xVar.mo6282a(t);
        }
    }

    /* renamed from: a */
    public static final <T> void m78357a(C2204x<T> xVar, Throwable th) {
        C52711k.m112240b(xVar, "$this$safeOnError");
        C52711k.m112240b(th, "t");
        if (xVar.isDisposed()) {
            xVar = null;
        }
        if (xVar != null) {
            xVar.mo6274a(th);
        }
    }
}
