package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.cw */
final class C17057cw implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f48139a;

    /* renamed from: b */
    private final /* synthetic */ zzk f48140b;

    /* renamed from: c */
    private final /* synthetic */ C17055cu f48141c;

    C17057cw(C17055cu cuVar, AtomicReference atomicReference, zzk zzk) {
        this.f48141c = cuVar;
        this.f48139a = atomicReference;
        this.f48140b = zzk;
    }

    public final void run() {
        synchronized (this.f48139a) {
            try {
                C17124i c = this.f48141c.f48131a;
                if (c == null) {
                    this.f48141c.mo32854q().f48445b.mo33376a("Failed to get app instance id");
                    this.f48139a.notify();
                    return;
                }
                this.f48139a.set(c.mo32958c(this.f48140b));
                String str = (String) this.f48139a.get();
                if (str != null) {
                    this.f48141c.mo32842e().mo32989a(str);
                    this.f48141c.mo32855r().f47882k.mo32886a(str);
                }
                this.f48141c.m41431F();
                this.f48139a.notify();
            } catch (RemoteException e) {
                try {
                    this.f48141c.mo32854q().f48445b.mo33377a("Failed to get app instance id", e);
                    this.f48139a.notify();
                } catch (Throwable th) {
                    this.f48139a.notify();
                    throw th;
                }
            }
        }
    }
}
