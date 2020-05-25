package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.oy */
public abstract class C16145oy extends bgp implements C16144ox {
    public C16145oy() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        int a = mo31230a();
        parcel2.writeNoException();
        parcel2.writeInt(a);
        return true;
    }
}
