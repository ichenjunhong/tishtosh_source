package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;

/* renamed from: com.google.android.gms.internal.ads.zf */
public final class C16423zf extends bgo implements C16421zd {
    C16423zf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* renamed from: a */
    public final void mo31526a(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(1, z);
    }

    /* renamed from: a */
    public final void mo31527a(C14882b bVar, int i) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        z.writeInt(i);
        mo30133b(2, z);
    }

    /* renamed from: b */
    public final void mo31529b(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(3, z);
    }

    /* renamed from: c */
    public final void mo31531c(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(4, z);
    }

    /* renamed from: d */
    public final void mo31532d(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(5, z);
    }

    /* renamed from: e */
    public final void mo31533e(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(6, z);
    }

    /* renamed from: a */
    public final void mo31528a(C14882b bVar, zzbaz zzbaz) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        bgq.m35596a(z, (Parcelable) zzbaz);
        mo30133b(7, z);
    }

    /* renamed from: f */
    public final void mo31534f(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(8, z);
    }

    /* renamed from: b */
    public final void mo31530b(C14882b bVar, int i) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        z.writeInt(i);
        mo30133b(9, z);
    }

    /* renamed from: g */
    public final void mo31535g(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(10, z);
    }

    /* renamed from: h */
    public final void mo31536h(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(11, z);
    }

    /* renamed from: a */
    public final void mo31525a(Bundle bundle) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) bundle);
        mo30133b(12, z);
    }
}
