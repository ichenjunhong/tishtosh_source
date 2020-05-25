package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class ape extends bgo implements apd {
    ape(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    /* renamed from: a */
    public final zzbqq mo29438a(zzbqo zzbqo) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) zzbqo);
        Parcel a = mo30131a(1, z);
        zzbqq zzbqq = (zzbqq) bgq.m35594a(a, zzbqq.CREATOR);
        a.recycle();
        return zzbqq;
    }

    /* renamed from: a */
    public final void mo29439a(zzbql zzbql) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) zzbql);
        mo30133b(2, z);
    }
}
