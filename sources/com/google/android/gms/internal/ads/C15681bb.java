package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.bb */
final class C15681bb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15679ba f41743a;

    C15681bb(C15679ba baVar) {
        this.f41743a = baVar;
    }

    public final void run() {
        if (this.f41743a.f41699a.f41623a != null) {
            try {
                this.f41743a.f41699a.f41623a.mo30870a(1);
            } catch (RemoteException e) {
                afc.m32795c("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
