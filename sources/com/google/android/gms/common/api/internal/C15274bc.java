package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C15328d.C15329a;

/* renamed from: com.google.android.gms.common.api.internal.bc */
final class C15274bc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ConnectionResult f39436a;

    /* renamed from: b */
    private final /* synthetic */ C15329a f39437b;

    C15274bc(C15329a aVar, ConnectionResult connectionResult) {
        this.f39437b = aVar;
        this.f39436a = connectionResult;
    }

    public final void run() {
        this.f39437b.onConnectionFailed(this.f39436a);
    }
}
