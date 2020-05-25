package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.de */
final class C17066de implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f48177a;

    /* renamed from: b */
    private final /* synthetic */ String f48178b;

    /* renamed from: c */
    private final /* synthetic */ String f48179c;

    /* renamed from: d */
    private final /* synthetic */ String f48180d;

    /* renamed from: e */
    private final /* synthetic */ boolean f48181e;

    /* renamed from: f */
    private final /* synthetic */ zzk f48182f;

    /* renamed from: g */
    private final /* synthetic */ C17055cu f48183g;

    C17066de(C17055cu cuVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z, zzk zzk) {
        this.f48183g = cuVar;
        this.f48177a = atomicReference;
        this.f48178b = str;
        this.f48179c = str2;
        this.f48180d = str3;
        this.f48181e = z;
        this.f48182f = zzk;
    }

    public final void run() {
        synchronized (this.f48177a) {
            try {
                C17124i c = this.f48183g.f48131a;
                if (c == null) {
                    this.f48183g.mo32854q().f48445b.mo33379a("Failed to get user properties", C17133r.m41997a(this.f48178b), this.f48179c, this.f48180d);
                    this.f48177a.set(Collections.emptyList());
                    this.f48177a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f48178b)) {
                    this.f48177a.set(c.mo32948a(this.f48179c, this.f48180d, this.f48181e, this.f48182f));
                } else {
                    this.f48177a.set(c.mo32947a(this.f48178b, this.f48179c, this.f48180d, this.f48181e));
                }
                this.f48183g.m41431F();
                this.f48177a.notify();
            } catch (RemoteException e) {
                try {
                    this.f48183g.mo32854q().f48445b.mo33379a("Failed to get user properties", C17133r.m41997a(this.f48178b), this.f48179c, e);
                    this.f48177a.set(Collections.emptyList());
                    this.f48177a.notify();
                } catch (Throwable th) {
                    this.f48177a.notify();
                    throw th;
                }
            }
        }
    }
}
