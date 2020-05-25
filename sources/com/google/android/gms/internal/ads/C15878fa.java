package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;

/* renamed from: com.google.android.gms.internal.ads.fa */
public final class C15878fa extends bgo implements C15875ey {
    C15878fa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    /* renamed from: a */
    public final void mo31067a(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(1, z);
    }

    /* renamed from: a */
    public final void mo31066a() throws RemoteException {
        mo30133b(2, mo30134z());
    }

    /* renamed from: b */
    public final void mo31068b(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(3, z);
    }
}
