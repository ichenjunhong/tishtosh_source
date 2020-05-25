package com.google.android.gms.internal.ads;

import android.os.RemoteException;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.aj */
public final class C15582aj {

    /* renamed from: a */
    public C15573ag f40652a;

    /* renamed from: b */
    private final String f40653b;

    public C15582aj(C15573ag agVar) {
        String str;
        this.f40652a = agVar;
        try {
            str = agVar.mo28808a();
        } catch (RemoteException e) {
            afc.m32793b("", e);
            str = null;
        }
        this.f40653b = str;
    }
}
