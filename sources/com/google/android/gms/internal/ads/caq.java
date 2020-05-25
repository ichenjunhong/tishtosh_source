package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class caq extends bgo implements cao {
    caq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* renamed from: a */
    public final void mo27642a(zzyv zzyv) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) zzyv);
        mo30133b(1, z);
    }

    /* renamed from: a */
    public final String mo27641a() throws RemoteException {
        Parcel a = mo30131a(2, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final boolean mo27645c() throws RemoteException {
        Parcel a = mo30131a(3, mo30134z());
        boolean a2 = bgq.m35598a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final String mo27644b() throws RemoteException {
        Parcel a = mo30131a(4, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo27643a(zzyv zzyv, int i) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) zzyv);
        z.writeInt(i);
        mo30133b(5, z);
    }
}
