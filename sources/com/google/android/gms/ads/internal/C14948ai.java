package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C15828df;
import com.google.android.gms.internal.ads.abv;

/* renamed from: com.google.android.gms.ads.internal.ai */
final class C14948ai implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15828df f38537a;

    /* renamed from: b */
    private final /* synthetic */ C14943ad f38538b;

    C14948ai(C14943ad adVar, C15828df dfVar) {
        this.f38538b = adVar;
        this.f38537a = dfVar;
    }

    public final void run() {
        try {
            if (this.f38538b.f38501e.f38644r != null) {
                this.f38538b.f38501e.f38644r.mo31075a(this.f38537a);
                this.f38538b.mo27524a(this.f38537a.mo30946n());
            }
        } catch (RemoteException e) {
            abv.m32797d("#007 Could not call remote method.", e);
        }
    }
}
