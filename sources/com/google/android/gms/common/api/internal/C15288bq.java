package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.bq */
final class C15288bq implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15287bp f39458a;

    C15288bq(C15287bp bpVar) {
        this.f39458a = bpVar;
    }

    public final void run() {
        this.f39458a.f39453c.mo28221b(new ConnectionResult(4));
    }
}
