package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.cx */
final class C17058cx implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzk f48142a;

    /* renamed from: b */
    private final /* synthetic */ C17055cu f48143b;

    C17058cx(C17055cu cuVar, zzk zzk) {
        this.f48143b = cuVar;
        this.f48142a = zzk;
    }

    public final void run() {
        C17124i c = this.f48143b.f48131a;
        if (c == null) {
            this.f48143b.mo32854q().f48445b.mo33376a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            c.mo32953a(this.f48142a);
            this.f48143b.mo33028a(c, null, this.f48142a);
            this.f48143b.m41431F();
        } catch (RemoteException e) {
            this.f48143b.mo32854q().f48445b.mo33377a("Failed to send app launch to the service", e);
        }
    }
}
