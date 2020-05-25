package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C15830dh;
import com.google.android.gms.internal.ads.abv;

/* renamed from: com.google.android.gms.ads.internal.br */
final class C14984br implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15830dh f38685a;

    /* renamed from: b */
    private final /* synthetic */ C14980bn f38686b;

    C14984br(C14980bn bnVar, C15830dh dhVar) {
        this.f38686b = bnVar;
        this.f38685a = dhVar;
    }

    public final void run() {
        try {
            if (this.f38686b.f38501e.f38645s != null) {
                this.f38686b.f38501e.f38645s.mo31077a(this.f38685a);
                this.f38686b.mo27612a(this.f38685a.mo30964n());
            }
        } catch (RemoteException e) {
            abv.m32797d("#007 Could not call remote method.", e);
        }
    }
}
