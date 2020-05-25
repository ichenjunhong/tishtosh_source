package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.C14963ax;

/* renamed from: com.google.android.gms.internal.ads.wu */
final class C16357wu implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzaxe f45838a;

    /* renamed from: b */
    private final /* synthetic */ C16332vw f45839b;

    /* renamed from: c */
    private final /* synthetic */ C16354wr f45840c;

    C16357wu(C16354wr wrVar, zzaxe zzaxe, C16332vw vwVar) {
        this.f45840c = wrVar;
        this.f45838a = zzaxe;
        this.f45839b = vwVar;
    }

    public final void run() {
        zzaxi zzaxi;
        try {
            zzaxi = this.f45840c.mo31444a(this.f45838a);
        } catch (Exception e) {
            C14963ax.m30834d().mo28588a((Throwable) e, "AdRequestServiceImpl.loadAdAsync");
            abv.m32795c("Could not fetch ad response due to an Exception.", e);
            zzaxi = null;
        }
        if (zzaxi == null) {
            zzaxi = new zzaxi(0);
        }
        try {
            this.f45839b.mo31439a(zzaxi);
        } catch (RemoteException e2) {
            abv.m32795c("Fail to forward ad response.", e2);
        }
    }
}
