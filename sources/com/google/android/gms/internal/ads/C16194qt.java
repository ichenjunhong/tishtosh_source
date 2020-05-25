package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.C15072n;

/* renamed from: com.google.android.gms.internal.ads.qt */
final class C16194qt implements C15072n<Object, Object> {

    /* renamed from: a */
    private final /* synthetic */ C16178qd f45442a;

    /* renamed from: b */
    private final /* synthetic */ C16141ou f45443b;

    /* renamed from: c */
    private final /* synthetic */ C16192qr f45444c;

    C16194qt(C16192qr qrVar, C16178qd qdVar, C16141ou ouVar) {
        this.f45444c = qrVar;
        this.f45442a = qdVar;
        this.f45443b = ouVar;
    }

    /* renamed from: a */
    public final void mo27792a(String str) {
        try {
            this.f45442a.mo31332a(str);
        } catch (RemoteException e) {
            afc.m32793b("", e);
        }
    }
}
