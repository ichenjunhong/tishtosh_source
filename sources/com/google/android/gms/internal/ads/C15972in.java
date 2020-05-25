package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.in */
public abstract class C15972in extends bgp implements C15971im {
    public C15972in() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo31098a((ParcelFileDescriptor) bgq.m35594a(parcel, ParcelFileDescriptor.CREATOR));
        return true;
    }
}
