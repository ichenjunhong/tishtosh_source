package com.google.android.gms.internal.ads;

import android.os.SystemClock;

final class bhg {

    /* renamed from: a */
    private boolean f42385a;

    /* renamed from: b */
    private long f42386b;

    /* renamed from: c */
    private long f42387c;

    bhg() {
    }

    /* renamed from: a */
    public final void mo30176a() {
        if (!this.f42385a) {
            this.f42385a = true;
            this.f42387c = m35673b(this.f42386b);
        }
    }

    /* renamed from: b */
    public final void mo30178b() {
        if (this.f42385a) {
            this.f42386b = m35673b(this.f42387c);
            this.f42385a = false;
        }
    }

    /* renamed from: a */
    public final void mo30177a(long j) {
        this.f42386b = j;
        this.f42387c = m35673b(j);
    }

    /* renamed from: c */
    public final long mo30179c() {
        return this.f42385a ? m35673b(this.f42387c) : this.f42386b;
    }

    /* renamed from: b */
    private static long m35673b(long j) {
        return (SystemClock.elapsedRealtime() * 1000) - j;
    }
}
