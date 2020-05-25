package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.iq */
public final class C15975iq extends bgo implements C15974ip {
    C15975iq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    /* renamed from: a */
    public final void mo31101a(zzaju zzaju, C15971im imVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) zzaju);
        bgq.m35595a(z, (IInterface) imVar);
        try {
            this.f42323a.transact(2, z, null, 1);
        } finally {
            z.recycle();
        }
    }
}
