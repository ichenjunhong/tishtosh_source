package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.fr */
public final class C15895fr extends bgo implements C15893fp {
    C15895fr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    /* renamed from: a */
    public final void mo31075a(C15881fd fdVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) fdVar);
        mo30133b(1, z);
    }
}
