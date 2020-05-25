package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.gf */
public abstract class C15910gf extends bgp implements C15909ge {
    public C15910gf() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C15914gj gjVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            gjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            if (queryLocalInterface instanceof C15914gj) {
                gjVar = (C15914gj) queryLocalInterface;
            } else {
                gjVar = new C15916gl(readStrongBinder);
            }
        }
        mo31081a(gjVar);
        parcel2.writeNoException();
        return true;
    }
}
