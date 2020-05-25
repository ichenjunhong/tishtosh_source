package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.yh */
public final class C16398yh extends bgo implements C16396yf {
    C16398yh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    /* renamed from: a */
    public final void mo31119a() throws RemoteException {
        mo30133b(1, mo30134z());
    }

    /* renamed from: b */
    public final void mo31122b() throws RemoteException {
        mo30133b(2, mo30134z());
    }

    /* renamed from: c */
    public final void mo31123c() throws RemoteException {
        mo30133b(3, mo30134z());
    }

    /* renamed from: d */
    public final void mo31124d() throws RemoteException {
        mo30133b(4, mo30134z());
    }

    /* renamed from: a */
    public final void mo31121a(C16385xv xvVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) xvVar);
        mo30133b(5, z);
    }

    /* renamed from: e */
    public final void mo31125e() throws RemoteException {
        mo30133b(6, mo30134z());
    }

    /* renamed from: a */
    public final void mo31120a(int i) throws RemoteException {
        Parcel z = mo30134z();
        z.writeInt(i);
        mo30133b(7, z);
    }

    /* renamed from: f */
    public final void mo31126f() throws RemoteException {
        mo30133b(8, mo30134z());
    }
}
