package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.cs */
public abstract class C15814cs extends bgp implements C15813cr {
    public C15814cs() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C15809cn cnVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            cnVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
            if (queryLocalInterface instanceof C15809cn) {
                cnVar = (C15809cn) queryLocalInterface;
            } else {
                cnVar = new C15811cp(readStrongBinder);
            }
        }
        mo30910a(cnVar);
        parcel2.writeNoException();
        return true;
    }
}
