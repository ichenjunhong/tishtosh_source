package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.location.e */
public abstract class C16507e extends C16519q implements C16506d {
    public C16507e() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo31719a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo31718a((zzad) C16525w.m39402a(parcel, zzad.CREATOR));
        return true;
    }
}
