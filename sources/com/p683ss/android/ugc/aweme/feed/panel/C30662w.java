package com.p683ss.android.ugc.aweme.feed.panel;

import p2628d.p2639f.p2640a.C52682m;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.w */
final /* synthetic */ class C30662w implements C52682m {

    /* renamed from: a */
    private final C30648q f80141a;

    C30662w(C30648q qVar) {
        this.f80141a = qVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        Float f = (Float) obj2;
        return Boolean.valueOf(Math.abs(f.floatValue()) > Math.abs(((Float) obj).floatValue()) && (f.floatValue() < 0.0f || this.f80141a.f79946F != 0));
    }
}
