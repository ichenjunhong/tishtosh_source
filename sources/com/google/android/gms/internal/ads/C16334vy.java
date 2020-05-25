package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.vy */
public final class C16334vy extends bgo implements C16332vw {
    C16334vy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    /* renamed from: a */
    public final void mo31439a(zzaxi zzaxi) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) zzaxi);
        mo30133b(1, z);
    }
}
