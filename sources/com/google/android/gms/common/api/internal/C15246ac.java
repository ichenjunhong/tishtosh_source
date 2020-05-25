package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15211a;
import com.google.android.gms.common.internal.C15428c.C15431c;
import com.google.android.gms.common.internal.C15464q;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.ac */
final class C15246ac implements C15431c {

    /* renamed from: a */
    final boolean f39357a;

    /* renamed from: b */
    private final WeakReference<C15244aa> f39358b;

    /* renamed from: c */
    private final C15211a<?> f39359c;

    public C15246ac(C15244aa aaVar, C15211a<?> aVar, boolean z) {
        this.f39358b = new WeakReference<>(aaVar);
        this.f39359c = aVar;
        this.f39357a = z;
    }

    /* renamed from: a */
    public final void mo28163a(ConnectionResult connectionResult) {
        C15244aa aaVar = (C15244aa) this.f39358b.get();
        if (aaVar != null) {
            C15464q.m32130a(Looper.myLooper() == aaVar.f39335a.f39422m.mo28107c(), (Object) "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            aaVar.f39342h.lock();
            try {
                if (aaVar.mo28157b(0)) {
                    if (!connectionResult.mo28024b()) {
                        aaVar.mo28155b(connectionResult, this.f39359c, this.f39357a);
                    }
                    if (aaVar.mo28159d()) {
                        aaVar.mo28160e();
                    }
                    aaVar.f39342h.unlock();
                }
            } finally {
                aaVar.f39342h.unlock();
            }
        }
    }
}
