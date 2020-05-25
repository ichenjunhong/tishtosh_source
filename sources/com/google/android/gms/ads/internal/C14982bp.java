package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C15835dm;
import com.google.android.gms.internal.ads.abv;

/* renamed from: com.google.android.gms.ads.internal.bp */
final class C14982bp implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15835dm f38681a;

    /* renamed from: b */
    private final /* synthetic */ C14980bn f38682b;

    C14982bp(C14980bn bnVar, C15835dm dmVar) {
        this.f38682b = bnVar;
        this.f38681a = dmVar;
    }

    public final void run() {
        try {
            if (this.f38682b.f38501e.f38646t != null) {
                this.f38682b.f38501e.f38646t.mo31081a(this.f38681a);
                this.f38682b.mo27612a(this.f38681a.mo30999q());
            }
        } catch (RemoteException e) {
            abv.m32797d("#007 Could not call remote method.", e);
        }
    }
}
