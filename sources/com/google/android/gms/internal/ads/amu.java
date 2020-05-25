package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final /* synthetic */ class amu implements Runnable {

    /* renamed from: a */
    private final ams f41050a;

    /* renamed from: b */
    private final int f41051b;

    /* renamed from: c */
    private final int f41052c;

    /* renamed from: d */
    private final boolean f41053d;

    /* renamed from: e */
    private final boolean f41054e;

    amu(ams ams, int i, int i2, boolean z, boolean z2) {
        this.f41050a = ams;
        this.f41051b = i;
        this.f41052c = i2;
        this.f41053d = z;
        this.f41054e = z2;
    }

    public final void run() {
        ams ams = this.f41050a;
        int i = this.f41051b;
        int i2 = this.f41052c;
        boolean z = this.f41053d;
        boolean z2 = this.f41054e;
        synchronized (ams.f41036b) {
            boolean z3 = false;
            boolean z4 = i != i2;
            boolean z5 = !ams.f41039e && i2 == 1;
            boolean z6 = z4 && i2 == 1;
            boolean z7 = z4 && i2 == 2;
            boolean z8 = z4 && i2 == 3;
            boolean z9 = z != z2;
            if (ams.f41039e || z5) {
                z3 = true;
            }
            ams.f41039e = z3;
            if (z5) {
                try {
                    if (ams.f41038d != null) {
                        ams.f41038d.mo29354a();
                    }
                } catch (RemoteException e) {
                    afc.m32797d("#007 Could not call remote method.", e);
                }
            }
            if (z6 && ams.f41038d != null) {
                ams.f41038d.mo29356b();
            }
            if (z7 && ams.f41038d != null) {
                ams.f41038d.mo29357c();
            }
            if (z8) {
                if (ams.f41038d != null) {
                    ams.f41038d.mo29358d();
                }
                ams.f41035a.mo28947n();
            }
            if (z9 && ams.f41038d != null) {
                ams.f41038d.mo29355a(z2);
            }
        }
    }
}
