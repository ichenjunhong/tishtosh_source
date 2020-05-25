package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ap */
public final class C15612ap extends bgo implements C15606an {
    C15612ap(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* renamed from: a */
    public final void mo29354a() throws RemoteException {
        mo30133b(1, mo30134z());
    }

    /* renamed from: b */
    public final void mo29356b() throws RemoteException {
        mo30133b(2, mo30134z());
    }

    /* renamed from: c */
    public final void mo29357c() throws RemoteException {
        mo30133b(3, mo30134z());
    }

    /* renamed from: d */
    public final void mo29358d() throws RemoteException {
        mo30133b(4, mo30134z());
    }

    /* renamed from: a */
    public final void mo29355a(boolean z) throws RemoteException {
        Parcel z2 = mo30134z();
        bgq.m35597a(z2, z);
        mo30133b(5, z2);
    }
}
