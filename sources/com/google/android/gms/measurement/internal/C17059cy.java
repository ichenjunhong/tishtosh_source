package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.cy */
final class C17059cy implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C17050cp f48144a;

    /* renamed from: b */
    private final /* synthetic */ C17055cu f48145b;

    C17059cy(C17055cu cuVar, C17050cp cpVar) {
        this.f48145b = cuVar;
        this.f48144a = cpVar;
    }

    public final void run() {
        C17124i c = this.f48145b.f48131a;
        if (c == null) {
            this.f48145b.mo32854q().f48445b.mo33376a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.f48144a == null) {
                c.mo32949a(0, (String) null, (String) null, this.f48145b.mo32850m().getPackageName());
            } else {
                c.mo32949a(this.f48144a.f48117c, this.f48144a.f48115a, this.f48144a.f48116b, this.f48145b.mo32850m().getPackageName());
            }
            this.f48145b.m41431F();
        } catch (RemoteException e) {
            this.f48145b.mo32854q().f48445b.mo33377a("Failed to send current screen to the service", e);
        }
    }
}
