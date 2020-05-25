package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14963ax;

@C16299uq
public final class aeh {

    /* renamed from: a */
    private long f40352a;

    /* renamed from: b */
    private long f40353b = Long.MIN_VALUE;

    /* renamed from: c */
    private final Object f40354c = new Object();

    public aeh(long j) {
        this.f40352a = j;
    }

    /* renamed from: a */
    public final boolean mo28750a() {
        synchronized (this.f40354c) {
            long b = C14963ax.m30837g().mo28524b();
            if (this.f40353b + this.f40352a > b) {
                return false;
            }
            this.f40353b = b;
            return true;
        }
    }

    /* renamed from: a */
    public final void mo28749a(long j) {
        synchronized (this.f40354c) {
            this.f40352a = j;
        }
    }
}
