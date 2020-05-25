package com.bytedance.android.live.core.rxutils;

import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.bytedance.android.live.core.rxutils.i */
public final class C4061i implements C1711f<C2201v<Throwable>, C2206z<?>> {

    /* renamed from: a */
    public final int f11210a;

    /* renamed from: b */
    public final long f11211b;

    /* renamed from: c */
    public int f11212c;

    public final /* synthetic */ Object apply(Object obj) throws Exception {
        return ((C2201v) obj).mo6520a((C1711f<? super T, ? extends C2206z<? extends R>>) new C1711f<Throwable, C2206z<?>>() {
            /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
                if (r0 == false) goto L_0x001f;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.lang.Object apply(java.lang.Object r5) throws java.lang.Exception {
                /*
                    r4 = this;
                    java.lang.Throwable r5 = (java.lang.Throwable) r5
                    boolean r0 = r5 instanceof com.bytedance.android.live.base.model.p189c.C2969a
                    r1 = 1
                    if (r0 == 0) goto L_0x001f
                    r0 = r5
                    com.bytedance.android.live.base.model.c.a r0 = (com.bytedance.android.live.base.model.p189c.C2969a) r0
                    int r2 = r0.getStatusCode()
                    r3 = 500(0x1f4, float:7.0E-43)
                    if (r2 < r3) goto L_0x001c
                    int r0 = r0.getStatusCode()
                    r2 = 599(0x257, float:8.4E-43)
                    if (r0 > r2) goto L_0x001c
                    r0 = 1
                    goto L_0x001d
                L_0x001c:
                    r0 = 0
                L_0x001d:
                    if (r0 != 0) goto L_0x0037
                L_0x001f:
                    com.bytedance.android.live.core.rxutils.i r0 = com.bytedance.android.live.core.rxutils.C4061i.this
                    int r2 = r0.f11212c
                    int r2 = r2 + r1
                    r0.f11212c = r2
                    com.bytedance.android.live.core.rxutils.i r0 = com.bytedance.android.live.core.rxutils.C4061i.this
                    int r0 = r0.f11210a
                    if (r2 > r0) goto L_0x0037
                    com.bytedance.android.live.core.rxutils.i r5 = com.bytedance.android.live.core.rxutils.C4061i.this
                    long r0 = r5.f11211b
                    java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
                    c.a.v r5 = p064c.p065a.C2201v.m6592a(r0, r5)
                    return r5
                L_0x0037:
                    c.a.v r5 = p064c.p065a.C2201v.m6606a(r5)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.rxutils.C4061i.C40621.apply(java.lang.Object):java.lang.Object");
            }
        });
    }

    public C4061i(int i, long j) {
        if (i <= 0) {
            i = 1;
        }
        this.f11210a = i;
        if (j <= 0) {
            j = 500;
        }
        this.f11211b = j;
    }
}
