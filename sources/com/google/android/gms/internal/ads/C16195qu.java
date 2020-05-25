package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.C15072n;

/* renamed from: com.google.android.gms.internal.ads.qu */
final class C16195qu implements C15072n<Object, Object> {

    /* renamed from: a */
    private final /* synthetic */ C16184qj f45445a;

    /* renamed from: b */
    private final /* synthetic */ C16141ou f45446b;

    /* renamed from: c */
    private final /* synthetic */ C16192qr f45447c;

    C16195qu(C16192qr qrVar, C16184qj qjVar, C16141ou ouVar) {
        this.f45447c = qrVar;
        this.f45445a = qjVar;
        this.f45446b = ouVar;
    }

    /* renamed from: a */
    public final void mo27792a(String str) {
        try {
            this.f45445a.mo31334a(str);
        } catch (RemoteException e) {
            afc.m32793b("", e);
        }
    }
}
