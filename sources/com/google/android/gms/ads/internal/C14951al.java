package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C15832dj;
import com.google.android.gms.internal.ads.C15903fz;
import com.google.android.gms.internal.ads.abb;
import com.google.android.gms.internal.ads.abv;

/* renamed from: com.google.android.gms.ads.internal.al */
final class C14951al implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f38543a;

    /* renamed from: b */
    private final /* synthetic */ abb f38544b;

    /* renamed from: c */
    private final /* synthetic */ C14943ad f38545c;

    C14951al(C14943ad adVar, String str, abb abb) {
        this.f38545c = adVar;
        this.f38543a = str;
        this.f38544b = abb;
    }

    public final void run() {
        try {
            ((C15903fz) this.f38545c.f38501e.f38649w.get(this.f38543a)).mo31079a((C15832dj) this.f38544b.f40084C);
        } catch (RemoteException e) {
            abv.m32797d("#007 Could not call remote method.", e);
        }
    }
}
