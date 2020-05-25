package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14882b.C14883a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ot */
public final class C16140ot extends bgo implements C16138or {
    C16140ot(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* renamed from: a */
    public final void mo31246a(C14882b bVar, zzyz zzyz, zzyv zzyv, String str, C16141ou ouVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        bgq.m35596a(z, (Parcelable) zzyz);
        bgq.m35596a(z, (Parcelable) zzyv);
        z.writeString(str);
        bgq.m35595a(z, (IInterface) ouVar);
        mo30133b(1, z);
    }

    /* renamed from: a */
    public final C14882b mo31238a() throws RemoteException {
        Parcel a = mo30131a(2, mo30134z());
        C14882b a2 = C14883a.m30535a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo31242a(C14882b bVar, zzyv zzyv, String str, C16141ou ouVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        bgq.m35596a(z, (Parcelable) zzyv);
        z.writeString(str);
        bgq.m35595a(z, (IInterface) ouVar);
        mo30133b(3, z);
    }

    /* renamed from: b */
    public final void mo31251b() throws RemoteException {
        mo30133b(4, mo30134z());
    }

    /* renamed from: c */
    public final void mo31254c() throws RemoteException {
        mo30133b(5, mo30134z());
    }

    /* renamed from: a */
    public final void mo31247a(C14882b bVar, zzyz zzyz, zzyv zzyv, String str, String str2, C16141ou ouVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        bgq.m35596a(z, (Parcelable) zzyz);
        bgq.m35596a(z, (Parcelable) zzyv);
        z.writeString(str);
        z.writeString(str2);
        bgq.m35595a(z, (IInterface) ouVar);
        mo30133b(6, z);
    }

    /* renamed from: a */
    public final void mo31244a(C14882b bVar, zzyv zzyv, String str, String str2, C16141ou ouVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        bgq.m35596a(z, (Parcelable) zzyv);
        z.writeString(str);
        z.writeString(str2);
        bgq.m35595a(z, (IInterface) ouVar);
        mo30133b(7, z);
    }

    /* renamed from: d */
    public final void mo31255d() throws RemoteException {
        mo30133b(8, mo30134z());
    }

    /* renamed from: e */
    public final void mo31256e() throws RemoteException {
        mo30133b(9, mo30134z());
    }

    /* renamed from: a */
    public final void mo31243a(C14882b bVar, zzyv zzyv, String str, C16421zd zdVar, String str2) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        bgq.m35596a(z, (Parcelable) zzyv);
        z.writeString(str);
        bgq.m35595a(z, (IInterface) zdVar);
        z.writeString(str2);
        mo30133b(10, z);
    }

    /* renamed from: a */
    public final void mo31248a(zzyv zzyv, String str) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) zzyv);
        z.writeString(str);
        mo30133b(11, z);
    }

    /* renamed from: f */
    public final void mo31257f() throws RemoteException {
        mo30133b(12, mo30134z());
    }

    /* renamed from: g */
    public final boolean mo31258g() throws RemoteException {
        Parcel a = mo30131a(13, mo30134z());
        boolean a2 = bgq.m35598a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo31245a(C14882b bVar, zzyv zzyv, String str, String str2, C16141ou ouVar, zzafl zzafl, List<String> list) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        bgq.m35596a(z, (Parcelable) zzyv);
        z.writeString(str);
        z.writeString(str2);
        bgq.m35595a(z, (IInterface) ouVar);
        bgq.m35596a(z, (Parcelable) zzafl);
        z.writeStringList(list);
        mo30133b(14, z);
    }

    /* renamed from: h */
    public final C16148pa mo31259h() throws RemoteException {
        C16148pa paVar;
        Parcel a = mo30131a(15, mo30134z());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            paVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            if (queryLocalInterface instanceof C16148pa) {
                paVar = (C16148pa) queryLocalInterface;
            } else {
                paVar = new C16150pc(readStrongBinder);
            }
        }
        a.recycle();
        return paVar;
    }

    /* renamed from: i */
    public final C16151pd mo31260i() throws RemoteException {
        C16151pd pdVar;
        Parcel a = mo30131a(16, mo30134z());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            pdVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            if (queryLocalInterface instanceof C16151pd) {
                pdVar = (C16151pd) queryLocalInterface;
            } else {
                pdVar = new C16153pf(readStrongBinder);
            }
        }
        a.recycle();
        return pdVar;
    }

    /* renamed from: j */
    public final Bundle mo31261j() throws RemoteException {
        Parcel a = mo30131a(17, mo30134z());
        Bundle bundle = (Bundle) bgq.m35594a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: k */
    public final Bundle mo31262k() throws RemoteException {
        Parcel a = mo30131a(18, mo30134z());
        Bundle bundle = (Bundle) bgq.m35594a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: l */
    public final Bundle mo31263l() throws RemoteException {
        Parcel a = mo30131a(19, mo30134z());
        Bundle bundle = (Bundle) bgq.m35594a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: a */
    public final void mo31249a(zzyv zzyv, String str, String str2) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) zzyv);
        z.writeString(str);
        z.writeString(str2);
        mo30133b(20, z);
    }

    /* renamed from: a */
    public final void mo31239a(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(21, z);
    }

    /* renamed from: m */
    public final boolean mo31264m() throws RemoteException {
        Parcel a = mo30131a(22, mo30134z());
        boolean a2 = bgq.m35598a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo31241a(C14882b bVar, C16421zd zdVar, List<String> list) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        bgq.m35595a(z, (IInterface) zdVar);
        z.writeStringList(list);
        mo30133b(23, z);
    }

    /* renamed from: n */
    public final C15889fl mo31265n() throws RemoteException {
        Parcel a = mo30131a(24, mo30134z());
        C15889fl a2 = C15890fm.m37599a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo31250a(boolean z) throws RemoteException {
        Parcel z2 = mo30134z();
        bgq.m35597a(z2, z);
        mo30133b(25, z2);
    }

    /* renamed from: o */
    public final C15583ak mo31266o() throws RemoteException {
        Parcel a = mo30131a(26, mo30134z());
        C15583ak a2 = C15584al.m33192a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: p */
    public final C16154pg mo31267p() throws RemoteException {
        C16154pg pgVar;
        Parcel a = mo30131a(27, mo30134z());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            pgVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            if (queryLocalInterface instanceof C16154pg) {
                pgVar = (C16154pg) queryLocalInterface;
            } else {
                pgVar = new C16156pi(readStrongBinder);
            }
        }
        a.recycle();
        return pgVar;
    }

    /* renamed from: b */
    public final void mo31253b(C14882b bVar, zzyv zzyv, String str, C16141ou ouVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        bgq.m35596a(z, (Parcelable) zzyv);
        z.writeString(str);
        bgq.m35595a(z, (IInterface) ouVar);
        mo30133b(28, z);
    }

    /* renamed from: b */
    public final void mo31252b(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(30, z);
    }

    /* renamed from: a */
    public final void mo31240a(C14882b bVar, C15983iy iyVar, List<zzakq> list) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        bgq.m35595a(z, (IInterface) iyVar);
        z.writeTypedList(list);
        mo30133b(31, z);
    }
}
