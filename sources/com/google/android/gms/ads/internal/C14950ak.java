package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C15830dh;
import com.google.android.gms.internal.ads.abv;

/* renamed from: com.google.android.gms.ads.internal.ak */
final class C14950ak implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15830dh f38541a;

    /* renamed from: b */
    private final /* synthetic */ C14943ad f38542b;

    C14950ak(C14943ad adVar, C15830dh dhVar) {
        this.f38542b = adVar;
        this.f38541a = dhVar;
    }

    public final void run() {
        try {
            if (this.f38542b.f38501e.f38645s != null) {
                this.f38542b.f38501e.f38645s.mo31077a(this.f38541a);
                this.f38542b.mo27524a(this.f38541a.mo30964n());
            }
        } catch (RemoteException e) {
            abv.m32797d("#007 Could not call remote method.", e);
        }
    }
}
