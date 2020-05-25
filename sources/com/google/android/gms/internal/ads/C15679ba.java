package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ba */
final class C15679ba extends cap {

    /* renamed from: a */
    final /* synthetic */ C15676ay f41699a;

    private C15679ba(C15676ay ayVar) {
        this.f41699a = ayVar;
    }

    /* renamed from: a */
    public final String mo27641a() throws RemoteException {
        return null;
    }

    /* renamed from: b */
    public final String mo27644b() throws RemoteException {
        return null;
    }

    /* renamed from: c */
    public final boolean mo27645c() throws RemoteException {
        return false;
    }

    /* renamed from: a */
    public final void mo27642a(zzyv zzyv) throws RemoteException {
        mo27643a(zzyv, 1);
    }

    /* renamed from: a */
    public final void mo27643a(zzyv zzyv, int i) throws RemoteException {
        afc.m32794c("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        aes.f40377a.post(new C15681bb(this));
    }
}
