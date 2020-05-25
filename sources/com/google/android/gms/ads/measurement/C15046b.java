package com.google.android.gms.ads.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.bgo;
import com.google.android.gms.internal.ads.bgq;
import com.google.android.gms.p1027a.C14882b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.measurement.b */
public final class C15046b extends bgo implements C15044a {
    C15046b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    /* renamed from: a */
    public final void mo27733a(Bundle bundle) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) bundle);
        mo30133b(1, z);
    }

    /* renamed from: b */
    public final Bundle mo27737b(Bundle bundle) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) bundle);
        Parcel a = mo30131a(2, z);
        Bundle bundle2 = (Bundle) bgq.m35594a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }

    /* renamed from: a */
    public final void mo27735a(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        z.writeString(str2);
        bgq.m35596a(z, (Parcelable) bundle);
        mo30133b(3, z);
    }

    /* renamed from: a */
    public final void mo27736a(String str, String str2, C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        z.writeString(str2);
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(4, z);
    }

    /* renamed from: a */
    public final Map mo27732a(String str, String str2, boolean z) throws RemoteException {
        Parcel z2 = mo30134z();
        z2.writeString(str);
        z2.writeString(str2);
        bgq.m35597a(z2, z);
        Parcel a = mo30131a(5, z2);
        HashMap readHashMap = a.readHashMap(bgq.f42325a);
        a.recycle();
        return readHashMap;
    }

    /* renamed from: a */
    public final int mo27729a(String str) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        Parcel a = mo30131a(6, z);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: c */
    public final void mo27742c(Bundle bundle) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) bundle);
        mo30133b(7, z);
    }

    /* renamed from: b */
    public final void mo27740b(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        z.writeString(str2);
        bgq.m35596a(z, (Parcelable) bundle);
        mo30133b(8, z);
    }

    /* renamed from: a */
    public final List mo27731a(String str, String str2) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        z.writeString(str2);
        Parcel a = mo30131a(9, z);
        ArrayList b = bgq.m35599b(a);
        a.recycle();
        return b;
    }

    /* renamed from: a */
    public final String mo27730a() throws RemoteException {
        Parcel a = mo30131a(10, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final String mo27738b() throws RemoteException {
        Parcel a = mo30131a(11, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final long mo27741c() throws RemoteException {
        Parcel a = mo30131a(12, mo30134z());
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }

    /* renamed from: b */
    public final void mo27739b(String str) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        mo30133b(13, z);
    }

    /* renamed from: c */
    public final void mo27743c(String str) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        mo30133b(14, z);
    }

    /* renamed from: a */
    public final void mo27734a(C14882b bVar, String str, String str2) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        z.writeString(str);
        z.writeString(str2);
        mo30133b(15, z);
    }

    /* renamed from: d */
    public final String mo27744d() throws RemoteException {
        Parcel a = mo30131a(16, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: e */
    public final String mo27745e() throws RemoteException {
        Parcel a = mo30131a(17, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: f */
    public final String mo27746f() throws RemoteException {
        Parcel a = mo30131a(18, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
