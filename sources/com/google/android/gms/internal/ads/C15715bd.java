package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.bd */
final class C15715bd implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15686bc f41916a;

    C15715bd(C15686bc bcVar) {
        this.f41916a = bcVar;
    }

    public final void run() {
        if (this.f41916a.f41796a != null) {
            try {
                this.f41916a.f41796a.mo30870a(1);
            } catch (RemoteException e) {
                afc.m32795c("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
