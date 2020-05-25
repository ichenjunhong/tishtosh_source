package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C15825dc;
import com.google.android.gms.internal.ads.C15990je;
import com.google.android.gms.internal.ads.abv;

/* renamed from: com.google.android.gms.ads.internal.af */
final /* synthetic */ class C14945af implements Runnable {

    /* renamed from: a */
    private final C14943ad f38525a;

    /* renamed from: b */
    private final C15825dc f38526b;

    C14945af(C14943ad adVar, C15825dc dcVar) {
        this.f38525a = adVar;
        this.f38526b = dcVar;
    }

    public final void run() {
        C14943ad adVar = this.f38525a;
        C15825dc dcVar = this.f38526b;
        try {
            if (adVar.f38501e.f38647u != null) {
                adVar.f38501e.f38647u.mo31112a((C15990je) dcVar);
            }
        } catch (RemoteException e) {
            abv.m32797d("#007 Could not call remote method.", e);
        }
    }
}
