package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C15428c.C15430b;

final class bya implements C15430b {

    /* renamed from: a */
    private final /* synthetic */ agl f44540a;

    /* renamed from: b */
    private final /* synthetic */ bxt f44541b;

    bya(bxt bxt, agl agl) {
        this.f44541b = bxt;
        this.f44540a = agl;
    }

    /* renamed from: a */
    public final void mo28418a(ConnectionResult connectionResult) {
        synchronized (this.f44541b.f44523d) {
            this.f44540a.mo28822a(new RuntimeException("Connection failed."));
        }
    }
}
