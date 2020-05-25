package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.gi */
public final class C15913gi extends bgo implements C15912gh {
    C15913gi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    /* renamed from: a */
    public final void mo31083a(String str) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        mo30133b(1, z);
    }

    /* renamed from: a */
    public final void mo31082a() throws RemoteException {
        mo30133b(2, mo30134z());
    }
}
