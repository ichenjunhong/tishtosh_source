package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.util.C15514e;

/* renamed from: com.google.android.gms.internal.measurement.ca */
final class C16584ca {

    /* renamed from: a */
    private final C15514e f46602a;

    /* renamed from: b */
    private long f46603b;

    public C16584ca(C15514e eVar) {
        C15464q.m32123a(eVar);
        this.f46602a = eVar;
    }

    public C16584ca(C15514e eVar, long j) {
        C15464q.m32123a(eVar);
        this.f46602a = eVar;
        this.f46603b = j;
    }

    /* renamed from: a */
    public final void mo31857a() {
        this.f46603b = this.f46602a.mo28524b();
    }

    /* renamed from: b */
    public final void mo31859b() {
        this.f46603b = 0;
    }

    /* renamed from: a */
    public final boolean mo31858a(long j) {
        if (this.f46603b != 0 && this.f46602a.mo28524b() - this.f46603b <= j) {
            return false;
        }
        return true;
    }
}
