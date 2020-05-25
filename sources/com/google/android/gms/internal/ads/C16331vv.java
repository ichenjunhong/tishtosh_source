package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.vv */
public final class C16331vv extends bgo implements C16329vt {
    C16331vv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* renamed from: a */
    public final zzaxi mo31444a(zzaxe zzaxe) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) zzaxe);
        Parcel a = mo30131a(1, z);
        zzaxi zzaxi = (zzaxi) bgq.m35594a(a, zzaxi.CREATOR);
        a.recycle();
        return zzaxi;
    }

    /* renamed from: a */
    public final void mo31445a(zzaxe zzaxe, C16332vw vwVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) zzaxe);
        bgq.m35595a(z, (IInterface) vwVar);
        mo30133b(2, z);
    }

    /* renamed from: a */
    public final void mo31446a(zzaxx zzaxx, C16335vz vzVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) zzaxx);
        bgq.m35595a(z, (IInterface) vzVar);
        mo30133b(4, z);
    }

    /* renamed from: b */
    public final void mo31447b(zzaxx zzaxx, C16335vz vzVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) zzaxx);
        bgq.m35595a(z, (IInterface) vzVar);
        mo30133b(5, z);
    }
}
