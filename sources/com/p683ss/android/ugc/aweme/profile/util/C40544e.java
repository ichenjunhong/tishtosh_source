package com.p683ss.android.ugc.aweme.profile.util;

import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.util.e */
final /* synthetic */ class C40544e implements Callable {

    /* renamed from: a */
    private final int f103448a;

    /* renamed from: b */
    private final boolean f103449b;

    /* renamed from: c */
    private final Exception f103450c;

    C40544e(int i, boolean z, Exception exc) {
        this.f103448a = i;
        this.f103449b = z;
        this.f103450c = exc;
    }

    public final Object call() {
        return C40542c.m89964b(this.f103448a, this.f103449b, this.f103450c);
    }
}
