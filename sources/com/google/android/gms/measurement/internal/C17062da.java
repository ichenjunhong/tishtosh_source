package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.da */
final class C17062da implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzk f48157a;

    /* renamed from: b */
    private final /* synthetic */ C17055cu f48158b;

    C17062da(C17055cu cuVar, zzk zzk) {
        this.f48158b = cuVar;
        this.f48157a = zzk;
    }

    public final void run() {
        C17124i c = this.f48158b.f48131a;
        if (c == null) {
            this.f48158b.mo32854q().f48445b.mo33376a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            c.mo32957b(this.f48157a);
            this.f48158b.m41431F();
        } catch (RemoteException e) {
            this.f48158b.mo32854q().f48445b.mo33377a("Failed to send measurementEnabled to the service", e);
        }
    }
}
