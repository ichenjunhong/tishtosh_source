package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ow */
public final class C16143ow extends bgo implements C16141ou {
    C16143ow(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* renamed from: a */
    public final void mo31201a() throws RemoteException {
        mo30133b(1, mo30134z());
    }

    /* renamed from: b */
    public final void mo31211b() throws RemoteException {
        mo30133b(2, mo30134z());
    }

    /* renamed from: a */
    public final void mo31202a(int i) throws RemoteException {
        Parcel z = mo30134z();
        z.writeInt(i);
        mo30133b(3, z);
    }

    /* renamed from: c */
    public final void mo31213c() throws RemoteException {
        mo30133b(4, mo30134z());
    }

    /* renamed from: d */
    public final void mo31214d() throws RemoteException {
        mo30133b(5, mo30134z());
    }

    /* renamed from: e */
    public final void mo31215e() throws RemoteException {
        mo30133b(6, mo30134z());
    }

    /* renamed from: a */
    public final void mo31206a(C16144ox oxVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) oxVar);
        mo30133b(7, z);
    }

    /* renamed from: f */
    public final void mo31216f() throws RemoteException {
        mo30133b(8, mo30134z());
    }

    /* renamed from: a */
    public final void mo31210a(String str, String str2) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        z.writeString(str2);
        mo30133b(9, z);
    }

    /* renamed from: a */
    public final void mo31204a(C15889fl flVar, String str) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) flVar);
        z.writeString(str);
        mo30133b(10, z);
    }

    /* renamed from: g */
    public final void mo31217g() throws RemoteException {
        mo30133b(11, mo30134z());
    }

    /* renamed from: a */
    public final void mo31209a(String str) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        mo30133b(12, z);
    }

    /* renamed from: h */
    public final void mo31218h() throws RemoteException {
        mo30133b(13, mo30134z());
    }

    /* renamed from: a */
    public final void mo31208a(zzbaz zzbaz) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) zzbaz);
        mo30133b(14, z);
    }

    /* renamed from: i */
    public final void mo31219i() throws RemoteException {
        mo30133b(15, mo30134z());
    }

    /* renamed from: a */
    public final void mo31207a(C16427zj zjVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) zjVar);
        mo30133b(16, z);
    }

    /* renamed from: b */
    public final void mo31212b(int i) throws RemoteException {
        Parcel z = mo30134z();
        z.writeInt(i);
        mo30133b(17, z);
    }

    /* renamed from: j */
    public final void mo31220j() throws RemoteException {
        mo30133b(18, mo30134z());
    }

    /* renamed from: a */
    public final void mo31203a(Bundle bundle) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) bundle);
        mo30133b(19, z);
    }

    /* renamed from: k */
    public final void mo31221k() throws RemoteException {
        mo30133b(20, mo30134z());
    }
}
