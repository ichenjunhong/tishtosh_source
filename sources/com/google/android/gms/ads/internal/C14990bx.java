package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.abb;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.ann;

/* renamed from: com.google.android.gms.ads.internal.bx */
final /* synthetic */ class C14990bx implements ann {

    /* renamed from: a */
    private final abb f38701a;

    /* renamed from: b */
    private final Runnable f38702b;

    C14990bx(abb abb, Runnable runnable) {
        this.f38701a = abb;
        this.f38702b = runnable;
    }

    /* renamed from: a */
    public final void mo27629a() {
        abb abb = this.f38701a;
        Runnable runnable = this.f38702b;
        if (!abb.f40115m) {
            acd.m32586a(runnable);
        }
    }
}
