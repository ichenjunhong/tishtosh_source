package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C15828df;
import com.google.android.gms.internal.ads.abv;

/* renamed from: com.google.android.gms.ads.internal.bq */
final class C14983bq implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15828df f38683a;

    /* renamed from: b */
    private final /* synthetic */ C14980bn f38684b;

    C14983bq(C14980bn bnVar, C15828df dfVar) {
        this.f38684b = bnVar;
        this.f38683a = dfVar;
    }

    public final void run() {
        try {
            if (this.f38684b.f38501e.f38644r != null) {
                this.f38684b.f38501e.f38644r.mo31075a(this.f38683a);
                this.f38684b.mo27612a(this.f38683a.mo30946n());
            }
        } catch (RemoteException e) {
            abv.m32797d("#007 Could not call remote method.", e);
        }
    }
}
