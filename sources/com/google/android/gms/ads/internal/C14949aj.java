package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C15835dm;
import com.google.android.gms.internal.ads.abv;

/* renamed from: com.google.android.gms.ads.internal.aj */
final class C14949aj implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15835dm f38539a;

    /* renamed from: b */
    private final /* synthetic */ C14943ad f38540b;

    C14949aj(C14943ad adVar, C15835dm dmVar) {
        this.f38540b = adVar;
        this.f38539a = dmVar;
    }

    public final void run() {
        try {
            if (this.f38540b.f38501e.f38646t != null) {
                this.f38540b.f38501e.f38646t.mo31081a(this.f38539a);
                this.f38540b.mo27524a(this.f38539a.mo30999q());
            }
        } catch (RemoteException e) {
            abv.m32797d("#007 Could not call remote method.", e);
        }
    }
}
