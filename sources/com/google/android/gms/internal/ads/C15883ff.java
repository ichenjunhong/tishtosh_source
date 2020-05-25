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

/* renamed from: com.google.android.gms.internal.ads.ff */
public final class C15883ff extends bgo implements C15881fd {
    C15883ff(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    /* renamed from: n */
    public final C14882b mo30946n() throws RemoteException {
        Parcel a = mo30131a(2, mo30134z());
        C14882b a2 = C14883a.m30535a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final String mo30934a() throws RemoteException {
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

    /* renamed from: g */
    public final String mo30939g() throws RemoteException {
        Parcel a = mo30131a(5, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: h */
    public final C15865eo mo30940h() throws RemoteException {
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

    /* renamed from: i */
    public final String mo30941i() throws RemoteException {
        Parcel a = mo30131a(7, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: j */
    public final double mo30942j() throws RemoteException {
        Parcel a = mo30131a(8, mo30134z());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    /* renamed from: k */
    public final String mo30943k() throws RemoteException {
        Parcel a = mo30131a(9, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: l */
    public final String mo30944l() throws RemoteException {
        Parcel a = mo30131a(10, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: o */
    public final Bundle mo30947o() throws RemoteException {
        Parcel a = mo30131a(11, mo30134z());
        Bundle bundle = (Bundle) bgq.m35594a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: s */
    public final void mo30951s() throws RemoteException {
        mo30133b(12, mo30134z());
    }

    /* renamed from: m */
    public final C15583ak mo30945m() throws RemoteException {
        Parcel a = mo30131a(13, mo30134z());
        C15583ak a2 = C15584al.m33192a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo30935a(Bundle bundle) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) bundle);
        mo30133b(14, z);
    }

    /* renamed from: b */
    public final boolean mo30936b(Bundle bundle) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) bundle);
        Parcel a = mo30131a(15, z);
        boolean a2 = bgq.m35598a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: c */
    public final void mo30937c(Bundle bundle) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) bundle);
        mo30133b(16, z);
    }

    /* renamed from: r */
    public final C15861ek mo30950r() throws RemoteException {
        C15861ek ekVar;
        Parcel a = mo30131a(17, mo30134z());
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

    /* renamed from: p */
    public final C14882b mo30948p() throws RemoteException {
        Parcel a = mo30131a(18, mo30134z());
        C14882b a2 = C14883a.m30535a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: q */
    public final String mo30949q() throws RemoteException {
        Parcel a = mo30131a(19, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
