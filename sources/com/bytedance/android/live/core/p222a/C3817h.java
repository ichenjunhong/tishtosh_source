package com.bytedance.android.live.core.p222a;

import p064c.p065a.p071d.C1712g;

/* renamed from: com.bytedance.android.live.core.a.h */
final /* synthetic */ class C3817h implements C1712g {

    /* renamed from: a */
    private final long f10769a;

    C3817h(long j) {
        this.f10769a = j;
    }

    /* renamed from: a */
    public final Object mo6205a(Object obj, Object obj2, Object obj3) {
        Long l = (Long) obj3;
        return Boolean.valueOf(System.currentTimeMillis() - l.longValue() > this.f10769a || System.currentTimeMillis() < l.longValue());
    }
}
