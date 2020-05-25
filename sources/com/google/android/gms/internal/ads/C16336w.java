package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.w */
public abstract class C16336w extends bgp implements C16309v {
    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        long a = mo30892a();
        parcel2.writeNoException();
        parcel2.writeLong(a);
        return true;
    }
}
