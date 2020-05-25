package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.fu */
public abstract class C15898fu extends bgp implements C15897ft {
    public C15898fu() {
        super("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C15885fh fhVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            fhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
            if (queryLocalInterface instanceof C15885fh) {
                fhVar = (C15885fh) queryLocalInterface;
            } else {
                fhVar = new C15887fj(readStrongBinder);
            }
        }
        mo31077a(fhVar);
        parcel2.writeNoException();
        return true;
    }
}
