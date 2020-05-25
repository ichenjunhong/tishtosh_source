package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class can extends bgo implements cal {
    can(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* renamed from: a */
    public final void mo30869a() throws RemoteException {
        mo30133b(1, mo30134z());
    }

    /* renamed from: a */
    public final void mo30870a(int i) throws RemoteException {
        Parcel z = mo30134z();
        z.writeInt(i);
        mo30133b(2, z);
    }

    /* renamed from: b */
    public final void mo30871b() throws RemoteException {
        mo30133b(3, mo30134z());
    }

    /* renamed from: c */
    public final void mo30872c() throws RemoteException {
        mo30133b(4, mo30134z());
    }

    /* renamed from: d */
    public final void mo30873d() throws RemoteException {
        mo30133b(5, mo30134z());
    }

    /* renamed from: f */
    public final void mo30875f() throws RemoteException {
        mo30133b(6, mo30134z());
    }

    /* renamed from: e */
    public final void mo30874e() throws RemoteException {
        mo30133b(7, mo30134z());
    }
}
