package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14882b.C14883a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.fj */
public final class C15887fj extends bgo implements C15885fh {
    C15887fj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    /* renamed from: n */
    public final C14882b mo30964n() throws RemoteException {
        Parcel a = mo30131a(2, mo30134z());
        C14882b a2 = C14883a.m30535a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final String mo30953a() throws RemoteException {
        Parcel a = mo30131a(3, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: f */
    public final List mo30938f() throws RemoteException {
        Parcel a = mo30131a(4, mo30134z());
        ArrayList b = bgq.m35599b(a);
        a.recycle();
        return b;
    }

    /* renamed from: i */
    public final String mo30959i() throws RemoteException {
        Parcel a = mo30131a(5, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: j */
    public final C15865eo mo30960j() throws RemoteException {
        C15865eo eoVar;
        Parcel a = mo30131a(6, mo30134z());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            eoVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            if (queryLocalInterface instanceof C15865eo) {
                eoVar = (C15865eo) queryLocalInterface;
            } else {
                eoVar = new C15867eq(readStrongBinder);
            }
        }
        a.recycle();
        return eoVar;
    }

    /* renamed from: k */
    public final String mo30961k() throws RemoteException {
        Parcel a = mo30131a(7, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: l */
    public final String mo30962l() throws RemoteException {
        Parcel a = mo30131a(8, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: o */
    public final Bundle mo30965o() throws RemoteException {
        Parcel a = mo30131a(9, mo30134z());
        Bundle bundle = (Bundle) bgq.m35594a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: q */
    public final void mo30967q() throws RemoteException {
        mo30133b(10, mo30134z());
    }

    /* renamed from: m */
    public final C15583ak mo30963m() throws RemoteException {
        Parcel a = mo30131a(11, mo30134z());
        C15583ak a2 = C15584al.m33192a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo30954a(Bundle bundle) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) bundle);
        mo30133b(12, z);
    }

    /* renamed from: b */
    public final boolean mo30955b(Bundle bundle) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) bundle);
        Parcel a = mo30131a(13, z);
        boolean a2 = bgq.m35598a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: c */
    public final void mo30956c(Bundle bundle) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) bundle);
        mo30133b(14, z);
    }

    /* renamed from: p */
    public final C15861ek mo30966p() throws RemoteException {
        C15861ek ekVar;
        Parcel a = mo30131a(15, mo30134z());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            ekVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            if (queryLocalInterface instanceof C15861ek) {
                ekVar = (C15861ek) queryLocalInterface;
            } else {
                ekVar = new C15863em(readStrongBinder);
            }
        }
        a.recycle();
        return ekVar;
    }

    /* renamed from: g */
    public final C14882b mo30957g() throws RemoteException {
        Parcel a = mo30131a(16, mo30134z());
        C14882b a2 = C14883a.m30535a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: h */
    public final String mo30958h() throws RemoteException {
        Parcel a = mo30131a(17, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
