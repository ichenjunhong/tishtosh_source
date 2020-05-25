package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.C15072n;

/* renamed from: com.google.android.gms.internal.ads.qs */
final class C16193qs implements C15072n<Object, Object> {

    /* renamed from: a */
    private final /* synthetic */ C16176qb f45440a;

    /* renamed from: b */
    private final /* synthetic */ C16141ou f45441b;

    C16193qs(C16192qr qrVar, C16176qb qbVar, C16141ou ouVar) {
        this.f45440a = qbVar;
        this.f45441b = ouVar;
    }

    /* renamed from: a */
    public final void mo27792a(String str) {
        try {
            this.f45440a.mo31331a(str);
        } catch (RemoteException e) {
            afc.m32793b("", e);
        }
    }
}
