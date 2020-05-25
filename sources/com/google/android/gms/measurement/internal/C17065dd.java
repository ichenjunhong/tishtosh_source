package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.dd */
final class C17065dd implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f48171a;

    /* renamed from: b */
    private final /* synthetic */ String f48172b;

    /* renamed from: c */
    private final /* synthetic */ String f48173c;

    /* renamed from: d */
    private final /* synthetic */ String f48174d;

    /* renamed from: e */
    private final /* synthetic */ zzk f48175e;

    /* renamed from: f */
    private final /* synthetic */ C17055cu f48176f;

    C17065dd(C17055cu cuVar, AtomicReference atomicReference, String str, String str2, String str3, zzk zzk) {
        this.f48176f = cuVar;
        this.f48171a = atomicReference;
        this.f48172b = str;
        this.f48173c = str2;
        this.f48174d = str3;
        this.f48175e = zzk;
    }

    public final void run() {
        synchronized (this.f48171a) {
            try {
                C17124i c = this.f48176f.f48131a;
                if (c == null) {
                    this.f48176f.mo32854q().f48445b.mo33379a("Failed to get conditional properties", C17133r.m41997a(this.f48172b), this.f48173c, this.f48174d);
                    this.f48171a.set(Collections.emptyList());
                    this.f48171a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f48172b)) {
                    this.f48171a.set(c.mo32945a(this.f48173c, this.f48174d, this.f48175e));
                } else {
                    this.f48171a.set(c.mo32946a(this.f48172b, this.f48173c, this.f48174d));
                }
                this.f48176f.m41431F();
                this.f48171a.notify();
            } catch (RemoteException e) {
                try {
                    this.f48176f.mo32854q().f48445b.mo33379a("Failed to get conditional properties", C17133r.m41997a(this.f48172b), this.f48173c, e);
                    this.f48171a.set(Collections.emptyList());
                    this.f48171a.notify();
                } catch (Throwable th) {
                    this.f48171a.notify();
                    throw th;
                }
            }
        }
    }
}
