package com.google.android.gms.ads.internal;

import android.os.Handler;

/* renamed from: com.google.android.gms.ads.internal.ap */
public final class C14955ap {

    /* renamed from: a */
    private final Handler f38556a;

    public C14955ap(Handler handler) {
        this.f38556a = handler;
    }

    /* renamed from: a */
    public final void mo27546a(Runnable runnable) {
        this.f38556a.removeCallbacks(runnable);
    }

    /* renamed from: a */
    public final boolean mo27547a(Runnable runnable, long j) {
        return this.f38556a.postDelayed(runnable, j);
    }
}
