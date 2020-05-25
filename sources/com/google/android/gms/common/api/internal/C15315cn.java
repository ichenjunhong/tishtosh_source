package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15211a;
import com.google.android.gms.common.api.C15233f.C15235b;
import com.google.android.gms.common.api.C15233f.C15236c;
import com.google.android.gms.common.internal.C15464q;

/* renamed from: com.google.android.gms.common.api.internal.cn */
public final class C15315cn implements C15235b, C15236c {

    /* renamed from: a */
    public final C15211a<?> f39513a;

    /* renamed from: b */
    public C15316co f39514b;

    /* renamed from: c */
    private final boolean f39515c;

    public C15315cn(C15211a<?> aVar, boolean z) {
        this.f39513a = aVar;
        this.f39515c = z;
    }

    public final void onConnected(Bundle bundle) {
        m31758a();
        this.f39514b.onConnected(bundle);
    }

    public final void onConnectionSuspended(int i) {
        m31758a();
        this.f39514b.onConnectionSuspended(i);
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        m31758a();
        this.f39514b.mo28185a(connectionResult, this.f39513a, this.f39515c);
    }

    /* renamed from: a */
    private final void m31758a() {
        C15464q.m32124a(this.f39514b, (Object) "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }
}
