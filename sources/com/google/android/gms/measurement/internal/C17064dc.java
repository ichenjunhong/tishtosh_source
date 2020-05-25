package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.dc */
final class C17064dc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f48165a = true;

    /* renamed from: b */
    private final /* synthetic */ boolean f48166b;

    /* renamed from: c */
    private final /* synthetic */ zzo f48167c;

    /* renamed from: d */
    private final /* synthetic */ zzk f48168d;

    /* renamed from: e */
    private final /* synthetic */ zzo f48169e;

    /* renamed from: f */
    private final /* synthetic */ C17055cu f48170f;

    C17064dc(C17055cu cuVar, boolean z, boolean z2, zzo zzo, zzk zzk, zzo zzo2) {
        this.f48170f = cuVar;
        this.f48166b = z2;
        this.f48167c = zzo;
        this.f48168d = zzk;
        this.f48169e = zzo2;
    }

    public final void run() {
        C17124i c = this.f48170f.f48131a;
        if (c == null) {
            this.f48170f.mo32854q().f48445b.mo33376a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f48165a) {
            this.f48170f.mo33028a(c, this.f48166b ? null : this.f48167c, this.f48168d);
        } else {
            try {
                if (TextUtils.isEmpty(this.f48169e.f48505a)) {
                    c.mo32955a(this.f48167c, this.f48168d);
                } else {
                    c.mo32954a(this.f48167c);
                }
            } catch (RemoteException e) {
                this.f48170f.mo32854q().f48445b.mo33377a("Failed to send conditional user property to the service", e);
            }
        }
        this.f48170f.m41431F();
    }
}
