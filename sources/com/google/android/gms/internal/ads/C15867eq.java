package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14882b.C14883a;

/* renamed from: com.google.android.gms.internal.ads.eq */
public final class C15867eq extends bgo implements C15865eo {
    C15867eq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* renamed from: a */
    public final C14882b mo30929a() throws RemoteException {
        Parcel a = mo30131a(1, mo30134z());
        C14882b a2 = C14883a.m30535a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final Uri mo30930b() throws RemoteException {
        Parcel a = mo30131a(2, mo30134z());
        Uri uri = (Uri) bgq.m35594a(a, Uri.CREATOR);
        a.recycle();
        return uri;
    }

    /* renamed from: c */
    public final double mo30931c() throws RemoteException {
        Parcel a = mo30131a(3, mo30134z());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    /* renamed from: d */
    public final int mo30932d() throws RemoteException {
        Parcel a = mo30131a(4, mo30134z());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: e */
    public final int mo30933e() throws RemoteException {
        Parcel a = mo30131a(5, mo30134z());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
