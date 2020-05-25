package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.q */
public abstract class C16174q extends bgp implements C16147p {
    public C16174q() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo30883a(parcel.readString(), parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
