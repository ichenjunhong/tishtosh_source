package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;

/* renamed from: com.google.android.gms.internal.ads.qn */
public final class C16188qn extends bgo implements C16186ql {
    C16188qn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* renamed from: a */
    public final void mo31337a(C14882b bVar, String str, Bundle bundle, Bundle bundle2, zzyz zzyz, C16189qo qoVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        z.writeString(str);
        bgq.m35596a(z, (Parcelable) bundle);
        bgq.m35596a(z, (Parcelable) bundle2);
        bgq.m35596a(z, (Parcelable) zzyz);
        bgq.m35595a(z, (IInterface) qoVar);
        mo30133b(1, z);
    }

    /* renamed from: a */
    public final zzaso mo31335a() throws RemoteException {
        Parcel a = mo30131a(2, mo30134z());
        zzaso zzaso = (zzaso) bgq.m35594a(a, zzaso.CREATOR);
        a.recycle();
        return zzaso;
    }

    /* renamed from: b */
    public final zzaso mo31343b() throws RemoteException {
        Parcel a = mo30131a(3, mo30134z());
        zzaso zzaso = (zzaso) bgq.m35594a(a, zzaso.CREATOR);
        a.recycle();
        return zzaso;
    }

    /* renamed from: c */
    public final C15583ak mo31345c() throws RemoteException {
        Parcel a = mo30131a(5, mo30134z());
        C15583ak a2 = C15584al.m33192a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo31336a(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(10, z);
    }

    /* renamed from: a */
    public final void mo31342a(String[] strArr, Bundle[] bundleArr) throws RemoteException {
        Parcel z = mo30134z();
        z.writeStringArray(strArr);
        z.writeTypedArray(bundleArr, 0);
        mo30133b(11, z);
    }

    /* renamed from: a */
    public final void mo31338a(String str, String str2, zzyv zzyv, C14882b bVar, C16176qb qbVar, C16141ou ouVar, zzyz zzyz) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        z.writeString(str2);
        bgq.m35596a(z, (Parcelable) zzyv);
        bgq.m35595a(z, (IInterface) bVar);
        bgq.m35595a(z, (IInterface) qbVar);
        bgq.m35595a(z, (IInterface) ouVar);
        bgq.m35596a(z, (Parcelable) zzyz);
        mo30133b(13, z);
    }

    /* renamed from: a */
    public final void mo31339a(String str, String str2, zzyv zzyv, C14882b bVar, C16178qd qdVar, C16141ou ouVar) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        z.writeString(str2);
        bgq.m35596a(z, (Parcelable) zzyv);
        bgq.m35595a(z, (IInterface) bVar);
        bgq.m35595a(z, (IInterface) qdVar);
        bgq.m35595a(z, (IInterface) ouVar);
        mo30133b(14, z);
    }

    /* renamed from: b */
    public final boolean mo31344b(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        Parcel a = mo30131a(15, z);
        boolean a2 = bgq.m35598a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo31341a(String str, String str2, zzyv zzyv, C14882b bVar, C16184qj qjVar, C16141ou ouVar) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        z.writeString(str2);
        bgq.m35596a(z, (Parcelable) zzyv);
        bgq.m35595a(z, (IInterface) bVar);
        bgq.m35595a(z, (IInterface) qjVar);
        bgq.m35595a(z, (IInterface) ouVar);
        mo30133b(16, z);
    }

    /* renamed from: c */
    public final boolean mo31346c(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        Parcel a = mo30131a(17, z);
        boolean a2 = bgq.m35598a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo31340a(String str, String str2, zzyv zzyv, C14882b bVar, C16180qf qfVar, C16141ou ouVar) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        z.writeString(str2);
        bgq.m35596a(z, (Parcelable) zzyv);
        bgq.m35595a(z, (IInterface) bVar);
        bgq.m35595a(z, (IInterface) qfVar);
        bgq.m35595a(z, (IInterface) ouVar);
        mo30133b(18, z);
    }
}
