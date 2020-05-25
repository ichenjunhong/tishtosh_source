package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.kl */
final class C16024kl implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C16025km f45103a;

    /* renamed from: b */
    private final /* synthetic */ C16026kn f45104b;

    C16024kl(C15998jm jmVar, C16025km kmVar, C16026kn knVar) {
        this.f45103a = kmVar;
        this.f45104b = knVar;
    }

    public final void run() {
        try {
            this.f45103a.mo31117a(this.f45104b);
        } catch (RemoteException e) {
            abv.m32795c("Could not propagate interstitial ad event.", e);
        }
    }
}
