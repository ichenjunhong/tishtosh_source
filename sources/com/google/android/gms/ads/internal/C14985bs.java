package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C15889fl;
import com.google.android.gms.internal.ads.C15903fz;
import com.google.android.gms.internal.ads.abv;

/* renamed from: com.google.android.gms.ads.internal.bs */
final class C14985bs implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15889fl f38687a;

    /* renamed from: b */
    private final /* synthetic */ C14980bn f38688b;

    C14985bs(C14980bn bnVar, C15889fl flVar) {
        this.f38688b = bnVar;
        this.f38687a = flVar;
    }

    public final void run() {
        try {
            ((C15903fz) this.f38688b.f38501e.f38649w.get(this.f38687a.mo30921c())).mo31079a(this.f38687a);
        } catch (RemoteException e) {
            abv.m32797d("#007 Could not call remote method.", e);
        }
    }
}
