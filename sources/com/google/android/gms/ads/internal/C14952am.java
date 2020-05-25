package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C15889fl;
import com.google.android.gms.internal.ads.C15903fz;
import com.google.android.gms.internal.ads.abv;

/* renamed from: com.google.android.gms.ads.internal.am */
final class C14952am implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15889fl f38546a;

    /* renamed from: b */
    private final /* synthetic */ C14943ad f38547b;

    C14952am(C14943ad adVar, C15889fl flVar) {
        this.f38547b = adVar;
        this.f38546a = flVar;
    }

    public final void run() {
        try {
            ((C15903fz) this.f38547b.f38501e.f38649w.get(this.f38546a.mo30921c())).mo31079a(this.f38546a);
        } catch (RemoteException e) {
            abv.m32797d("#007 Could not call remote method.", e);
        }
    }
}
