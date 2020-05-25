package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;

/* renamed from: com.google.android.gms.internal.ads.yc */
public final class C16393yc extends bgo implements C16391ya {
    C16393yc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* renamed from: a */
    public final void mo31488a(zzbad zzbad) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) zzbad);
        mo30133b(1, z);
    }

    /* renamed from: a */
    public final void mo31483a() throws RemoteException {
        mo30133b(2, mo30134z());
    }

    /* renamed from: a */
    public final void mo31487a(C16396yf yfVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) yfVar);
        mo30133b(3, z);
    }

    /* renamed from: c */
    public final boolean mo31496c() throws RemoteException {
        Parcel a = mo30131a(5, mo30134z());
        boolean a2 = bgq.m35598a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: d */
    public final void mo31497d() throws RemoteException {
        mo30133b(6, mo30134z());
    }

    /* renamed from: e */
    public final void mo31499e() throws RemoteException {
        mo30133b(7, mo30134z());
    }

    /* renamed from: f */
    public final void mo31500f() throws RemoteException {
        mo30133b(8, mo30134z());
    }

    /* renamed from: b */
    public final void mo31492b(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(9, z);
    }

    /* renamed from: c */
    public final void mo31494c(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(10, z);
    }

    /* renamed from: d */
    public final void mo31498d(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(11, z);
    }

    /* renamed from: g */
    public final String mo31501g() throws RemoteException {
        Parcel a = mo30131a(12, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final void mo31493b(String str) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        mo30133b(13, z);
    }

    /* renamed from: a */
    public final void mo31485a(C16066m mVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) mVar);
        mo30133b(14, z);
    }

    /* renamed from: b */
    public final Bundle mo31491b() throws RemoteException {
        Parcel a = mo30131a(15, mo30134z());
        Bundle bundle = (Bundle) bgq.m35594a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: a */
    public final void mo31486a(C16388xy xyVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) xyVar);
        mo30133b(16, z);
    }

    /* renamed from: a */
    public final void mo31489a(String str) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        mo30133b(17, z);
    }

    /* renamed from: a */
    public final void mo31484a(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(18, z);
    }

    /* renamed from: c */
    public final void mo31495c(String str) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        mo30133b(19, z);
    }

    /* renamed from: a */
    public final void mo31490a(boolean z) throws RemoteException {
        Parcel z2 = mo30134z();
        bgq.m35597a(z2, z);
        mo30133b(34, z2);
    }
}
