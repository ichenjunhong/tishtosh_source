package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.location.f */
public final class C16508f extends C16501a implements C16506d {
    C16508f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    /* renamed from: a */
    public final void mo31718a(zzad zzad) throws RemoteException {
        Parcel a = mo31710a();
        C16525w.m39403a(a, (Parcelable) zzad);
        mo31713b(1, a);
    }
}
