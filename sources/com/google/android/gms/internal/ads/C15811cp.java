package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;

/* renamed from: com.google.android.gms.internal.ads.cp */
public final class C15811cp extends bgo implements C15809cn {
    C15811cp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    /* renamed from: a */
    public final String mo30905a() throws RemoteException {
        Parcel a = mo30131a(1, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final String mo30907b() throws RemoteException {
        Parcel a = mo30131a(2, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo30906a(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(3, z);
    }

    /* renamed from: c */
    public final void mo30908c() throws RemoteException {
        mo30133b(4, mo30134z());
    }

    /* renamed from: d */
    public final void mo30909d() throws RemoteException {
        mo30133b(5, mo30134z());
    }
}
