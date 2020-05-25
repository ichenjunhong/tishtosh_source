package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.n */
public abstract class C16093n extends bgp implements C16066m {
    public C16093n() {
        super("com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo30878a();
        parcel2.writeNoException();
        return true;
    }
}
