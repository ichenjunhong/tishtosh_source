package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.C15069k;
import com.google.android.gms.ads.mediation.C15072n;

/* renamed from: com.google.android.gms.internal.ads.qv */
final class C16196qv implements C15072n<C15069k, Object> {

    /* renamed from: a */
    private final /* synthetic */ C16180qf f45448a;

    /* renamed from: b */
    private final /* synthetic */ C16141ou f45449b;

    C16196qv(C16192qr qrVar, C16180qf qfVar, C16141ou ouVar) {
        this.f45448a = qfVar;
        this.f45449b = ouVar;
    }

    /* renamed from: a */
    public final void mo27792a(String str) {
        try {
            this.f45448a.mo31333a(str);
        } catch (RemoteException e) {
            afc.m32793b("", e);
        }
    }
}
