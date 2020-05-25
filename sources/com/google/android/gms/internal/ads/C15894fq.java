package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.fq */
public abstract class C15894fq extends bgp implements C15893fp {
    public C15894fq() {
        super("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C15881fd fdVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            fdVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
            if (queryLocalInterface instanceof C15881fd) {
                fdVar = (C15881fd) queryLocalInterface;
            } else {
                fdVar = new C15883ff(readStrongBinder);
            }
        }
        mo31075a(fdVar);
        parcel2.writeNoException();
        return true;
    }
}
