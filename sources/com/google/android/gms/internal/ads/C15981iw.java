package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C15428c.C15430b;

/* renamed from: com.google.android.gms.internal.ads.iw */
final class C15981iw implements C15430b {

    /* renamed from: a */
    private final /* synthetic */ agl f45082a;

    C15981iw(C15976ir irVar, agl agl) {
        this.f45082a = agl;
    }

    /* renamed from: a */
    public final void mo28418a(ConnectionResult connectionResult) {
        this.f45082a.mo28822a(new RuntimeException("Connection failed."));
    }
}
