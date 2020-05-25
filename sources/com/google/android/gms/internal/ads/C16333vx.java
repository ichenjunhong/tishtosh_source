package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.vx */
public abstract class C16333vx extends bgp implements C16332vw {
    public C16333vx() {
        super("com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo31439a((zzaxi) bgq.m35594a(parcel, zzaxi.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
