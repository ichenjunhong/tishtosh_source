package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ol */
final class C16132ol implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C16125oe f45382a;

    C16132ol(C16131ok okVar, C16125oe oeVar) {
        this.f45382a = oeVar;
    }

    public final void run() {
        try {
            this.f45382a.f45343c.mo31254c();
        } catch (RemoteException e) {
            abv.m32795c("Could not destroy mediation adapter.", e);
        }
    }
}
