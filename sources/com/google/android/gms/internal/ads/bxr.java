package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class bxr extends bgo implements bxq {
    bxr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    /* renamed from: a */
    public final zzwo mo30854a(zzwr zzwr) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) zzwr);
        Parcel a = mo30131a(1, z);
        zzwo zzwo = (zzwo) bgq.m35594a(a, zzwo.CREATOR);
        a.recycle();
        return zzwo;
    }
}
