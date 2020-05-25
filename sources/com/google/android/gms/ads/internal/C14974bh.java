package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.abb;
import com.google.android.gms.internal.ads.abc;

/* renamed from: com.google.android.gms.ads.internal.bh */
final class C14974bh implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ abc f38666a;

    /* renamed from: b */
    private final /* synthetic */ C14972bf f38667b;

    C14974bh(C14972bf bfVar, abc abc) {
        this.f38667b = bfVar;
        this.f38666a = abc;
    }

    public final void run() {
        C14972bf bfVar = this.f38667b;
        abb abb = new abb(this.f38666a, null, null, null, null, null, null, null);
        bfVar.mo27479b(abb);
    }
}
