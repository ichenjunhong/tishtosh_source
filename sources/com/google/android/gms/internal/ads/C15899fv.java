package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.fv */
public final class C15899fv extends bgo implements C15897ft {
    C15899fv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    /* renamed from: a */
    public final void mo31077a(C15885fh fhVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) fhVar);
        mo30133b(1, z);
    }
}
