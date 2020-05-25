package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14882b.C14883a;

/* renamed from: com.google.android.gms.internal.ads.j */
public final class C15985j extends bgo implements C15931h {
    C15985j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* renamed from: h */
    public final C14882b mo27486h() throws RemoteException {
        Parcel a = mo30131a(1, mo30134z());
        C14882b a2 = C14883a.m30535a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: g */
    public final void mo27485g() throws RemoteException {
        mo30133b(2, mo30134z());
    }

    /* renamed from: j */
    public final boolean mo27488j() throws RemoteException {
        Parcel a = mo30131a(3, mo30134z());
        boolean a2 = bgq.m35598a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final boolean mo27482b(zzyv zzyv) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) zzyv);
        Parcel a = mo30131a(4, z);
        boolean a2 = bgq.m35598a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: l */
    public final void mo27490l() throws RemoteException {
        mo30133b(5, mo30134z());
    }

    /* renamed from: m */
    public final void mo27491m() throws RemoteException {
        mo30133b(6, mo30134z());
    }

    /* renamed from: a */
    public final void mo27457a(cal cal) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) cal);
        mo30133b(7, z);
    }

    /* renamed from: a */
    public final void mo27461a(C16147p pVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) pVar);
        mo30133b(8, z);
    }

    /* renamed from: E */
    public final void mo27508E() throws RemoteException {
        mo30133b(9, mo30134z());
    }

    /* renamed from: o */
    public final void mo27493o() throws RemoteException {
        mo30133b(10, mo30134z());
    }

    /* renamed from: k */
    public final void mo27489k() throws RemoteException {
        mo30133b(11, mo30134z());
    }

    /* renamed from: i */
    public final zzyz mo27487i() throws RemoteException {
        Parcel a = mo30131a(12, mo30134z());
        zzyz zzyz = (zzyz) bgq.m35594a(a, zzyz.CREATOR);
        a.recycle();
        return zzyz;
    }

    /* renamed from: a */
    public final void mo27470a(zzyz zzyz) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) zzyz);
        mo30133b(13, z);
    }

    /* renamed from: a */
    public final void mo27462a(C16230sb sbVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) sbVar);
        mo30133b(14, z);
    }

    /* renamed from: a */
    public final void mo27463a(C16234sf sfVar, String str) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) sfVar);
        z.writeString(str);
        mo30133b(15, z);
    }

    /* renamed from: a */
    public final String mo27551a() throws RemoteException {
        Parcel a = mo30131a(18, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo27459a(C15813cr crVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) crVar);
        mo30133b(19, z);
    }

    /* renamed from: a */
    public final void mo27456a(cai cai) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) cai);
        mo30133b(20, z);
    }

    /* renamed from: a */
    public final void mo27464a(C16309v vVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) vVar);
        mo30133b(21, z);
    }

    /* renamed from: a */
    public final void mo27475a(boolean z) throws RemoteException {
        Parcel z2 = mo30134z();
        bgq.m35597a(z2, z);
        mo30133b(22, z2);
    }

    /* renamed from: p */
    public final boolean mo27494p() throws RemoteException {
        Parcel a = mo30131a(23, mo30134z());
        boolean a2 = bgq.m35598a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo27466a(C16396yf yfVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) yfVar);
        mo30133b(24, z);
    }

    /* renamed from: a */
    public final void mo27471a(String str) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        mo30133b(25, z);
    }

    /* renamed from: q */
    public final C15583ak mo27495q() throws RemoteException {
        C15583ak akVar;
        Parcel a = mo30131a(26, mo30134z());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            akVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            if (queryLocalInterface instanceof C15583ak) {
                akVar = (C15583ak) queryLocalInterface;
            } else {
                akVar = new C15586am(readStrongBinder);
            }
        }
        a.recycle();
        return akVar;
    }

    /* renamed from: a */
    public final void mo27468a(zzacq zzacq) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) zzacq);
        mo30133b(29, z);
    }

    /* renamed from: a */
    public final void mo27467a(zzabp zzabp) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) zzabp);
        mo30133b(30, z);
    }

    /* renamed from: A */
    public final String mo27444A() throws RemoteException {
        Parcel a = mo30131a(31, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: B */
    public final C16147p mo27445B() throws RemoteException {
        C16147p pVar;
        Parcel a = mo30131a(32, mo30134z());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            pVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            if (queryLocalInterface instanceof C16147p) {
                pVar = (C16147p) queryLocalInterface;
            } else {
                pVar = new C16201r(readStrongBinder);
            }
        }
        a.recycle();
        return pVar;
    }

    /* renamed from: C */
    public final cal mo27446C() throws RemoteException {
        cal cal;
        Parcel a = mo30131a(33, mo30134z());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            cal = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            if (queryLocalInterface instanceof cal) {
                cal = (cal) queryLocalInterface;
            } else {
                cal = new can(readStrongBinder);
            }
        }
        a.recycle();
        return cal;
    }

    /* renamed from: b */
    public final void mo27481b(boolean z) throws RemoteException {
        Parcel z2 = mo30134z();
        bgq.m35597a(z2, z);
        mo30133b(34, z2);
    }

    /* renamed from: B_ */
    public final String mo27550B_() throws RemoteException {
        Parcel a = mo30131a(35, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo27460a(C16066m mVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) mVar);
        mo30133b(36, z);
    }

    /* renamed from: n */
    public final Bundle mo27492n() throws RemoteException {
        Parcel a = mo30131a(37, mo30134z());
        Bundle bundle = (Bundle) bgq.m35594a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: b */
    public final void mo27480b(String str) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        mo30133b(38, z);
    }
}
