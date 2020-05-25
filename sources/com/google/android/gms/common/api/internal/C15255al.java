package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15211a;
import com.google.android.gms.common.api.C15211a.C15213b;
import com.google.android.gms.common.api.C15211a.C15222f;
import com.google.android.gms.common.api.C15358j;
import com.google.android.gms.common.api.internal.C15298c.C15299a;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.internal.al */
public final class C15255al implements C15264au {

    /* renamed from: a */
    private final C15265av f39372a;

    public C15255al(C15265av avVar) {
        this.f39372a = avVar;
    }

    /* renamed from: a */
    public final void mo28150a(int i) {
    }

    /* renamed from: a */
    public final void mo28151a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo28152a(ConnectionResult connectionResult, C15211a<?> aVar, boolean z) {
    }

    /* renamed from: b */
    public final boolean mo28156b() {
        return true;
    }

    /* renamed from: a */
    public final void mo28149a() {
        for (C15222f f : this.f39372a.f39415f.values()) {
            f.mo28073f();
        }
        this.f39372a.f39422m.f39377e = Collections.emptySet();
    }

    /* renamed from: a */
    public final <A extends C15213b, T extends C15299a<? extends C15358j, A>> T mo28148a(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: c */
    public final void mo28158c() {
        C15265av avVar = this.f39372a;
        avVar.f39410a.lock();
        try {
            C15244aa aaVar = new C15244aa(avVar, avVar.f39417h, avVar.f39418i, avVar.f39413d, avVar.f39419j, avVar.f39410a, avVar.f39412c);
            avVar.f39420k = aaVar;
            avVar.f39420k.mo28149a();
            avVar.f39411b.signalAll();
        } finally {
            avVar.f39410a.unlock();
        }
    }
}
