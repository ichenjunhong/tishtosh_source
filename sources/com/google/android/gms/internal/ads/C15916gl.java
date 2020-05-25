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

/* renamed from: com.google.android.gms.internal.ads.gl */
public final class C15916gl extends bgo implements C15914gj {
    C15916gl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* renamed from: a */
    public final String mo30982a() throws RemoteException {
        Parcel a = mo30131a(2, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: f */
    public final List mo30938f() throws RemoteException {
        Parcel a = mo30131a(3, mo30134z());
        ArrayList b = bgq.m35599b(a);
        a.recycle();
        return b;
    }

    /* renamed from: i */
    public final String mo30991i() throws RemoteException {
        Parcel a = mo30131a(4, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: j */
    public final C15865eo mo30992j() throws RemoteException {
        C15865eo eoVar;
        Parcel a = mo30131a(5, mo30134z());
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
    public final String mo30993k() throws RemoteException {
        Parcel a = mo30131a(6, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: l */
    public final String mo30994l() throws RemoteException {
        Parcel a = mo30131a(7, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: m */
    public final double mo30995m() throws RemoteException {
        Parcel a = mo30131a(8, mo30134z());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    /* renamed from: n */
    public final String mo30996n() throws RemoteException {
        Parcel a = mo30131a(9, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: o */
    public final String mo30997o() throws RemoteException {
        Parcel a = mo30131a(10, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: p */
    public final C15583ak mo30998p() throws RemoteException {
        Parcel a = mo30131a(11, mo30134z());
        C15583ak a2 = C15584al.m33192a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: s */
    public final String mo31001s() throws RemoteException {
        Parcel a = mo30131a(12, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: v */
    public final void mo31004v() throws RemoteException {
        mo30133b(13, mo30134z());
    }

    /* renamed from: u */
    public final C15861ek mo31003u() throws RemoteException {
        C15861ek ekVar;
        Parcel a = mo30131a(14, mo30134z());
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

    /* renamed from: a */
    public final void mo30983a(Bundle bundle) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) bundle);
        mo30133b(15, z);
    }

    /* renamed from: b */
    public final boolean mo30987b(Bundle bundle) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) bundle);
        Parcel a = mo30131a(16, z);
        boolean a2 = bgq.m35598a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: c */
    public final void mo30988c(Bundle bundle) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) bundle);
        mo30133b(17, z);
    }

    /* renamed from: q */
    public final C14882b mo30999q() throws RemoteException {
        Parcel a = mo30131a(18, mo30134z());
        C14882b a2 = C14883a.m30535a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: r */
    public final C14882b mo31000r() throws RemoteException {
        Parcel a = mo30131a(19, mo30134z());
        C14882b a2 = C14883a.m30535a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: t */
    public final Bundle mo31002t() throws RemoteException {
        Parcel a = mo30131a(20, mo30134z());
        Bundle bundle = (Bundle) bgq.m35594a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: a */
    public final void mo30986a(C15912gh ghVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) ghVar);
        mo30133b(21, z);
    }

    /* renamed from: y */
    public final void mo31007y() throws RemoteException {
        mo30133b(22, mo30134z());
    }

    /* renamed from: g */
    public final List mo30989g() throws RemoteException {
        Parcel a = mo30131a(23, mo30134z());
        ArrayList b = bgq.m35599b(a);
        a.recycle();
        return b;
    }

    /* renamed from: h */
    public final boolean mo30990h() throws RemoteException {
        Parcel a = mo30131a(24, mo30134z());
        boolean a2 = bgq.m35598a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo30985a(C15573ag agVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) agVar);
        mo30133b(25, z);
    }

    /* renamed from: a */
    public final void mo30984a(C15569ae aeVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) aeVar);
        mo30133b(26, z);
    }

    /* renamed from: w */
    public final void mo31005w() throws RemoteException {
        mo30133b(27, mo30134z());
    }

    /* renamed from: x */
    public final void mo31006x() throws RemoteException {
        mo30133b(28, mo30134z());
    }
}
