package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14882b.C14883a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.pf */
public final class C16153pf extends bgo implements C16151pd {
    C16153pf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* renamed from: a */
    public final String mo31289a() throws RemoteException {
        Parcel a = mo30131a(2, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final List mo31292b() throws RemoteException {
        Parcel a = mo30131a(3, mo30134z());
        ArrayList b = bgq.m35599b(a);
        a.recycle();
        return b;
    }

    /* renamed from: c */
    public final String mo31294c() throws RemoteException {
        Parcel a = mo30131a(4, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: d */
    public final C15865eo mo31296d() throws RemoteException {
        Parcel a = mo30131a(5, mo30134z());
        C15865eo a2 = C15866ep.m37470a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: e */
    public final String mo31297e() throws RemoteException {
        Parcel a = mo30131a(6, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: f */
    public final String mo31298f() throws RemoteException {
        Parcel a = mo30131a(7, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: g */
    public final void mo31299g() throws RemoteException {
        mo30133b(8, mo30134z());
    }

    /* renamed from: a */
    public final void mo31290a(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(9, z);
    }

    /* renamed from: b */
    public final void mo31293b(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(10, z);
    }

    /* renamed from: h */
    public final boolean mo31300h() throws RemoteException {
        Parcel a = mo30131a(11, mo30134z());
        boolean a2 = bgq.m35598a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: i */
    public final boolean mo31301i() throws RemoteException {
        Parcel a = mo30131a(12, mo30134z());
        boolean a2 = bgq.m35598a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: j */
    public final Bundle mo31302j() throws RemoteException {
        Parcel a = mo30131a(13, mo30134z());
        Bundle bundle = (Bundle) bgq.m35594a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: c */
    public final void mo31295c(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(14, z);
    }

    /* renamed from: k */
    public final C14882b mo31303k() throws RemoteException {
        Parcel a = mo30131a(15, mo30134z());
        C14882b a2 = C14883a.m30535a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: l */
    public final C15583ak mo31304l() throws RemoteException {
        Parcel a = mo30131a(16, mo30134z());
        C15583ak a2 = C15584al.m33192a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: m */
    public final C15861ek mo31305m() throws RemoteException {
        Parcel a = mo30131a(19, mo30134z());
        C15861ek a2 = C15862el.m37462a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: n */
    public final C14882b mo31306n() throws RemoteException {
        Parcel a = mo30131a(20, mo30134z());
        C14882b a2 = C14883a.m30535a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: o */
    public final C14882b mo31307o() throws RemoteException {
        Parcel a = mo30131a(21, mo30134z());
        C14882b a2 = C14883a.m30535a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo31291a(C14882b bVar, C14882b bVar2, C14882b bVar3) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        bgq.m35595a(z, (IInterface) bVar2);
        bgq.m35595a(z, (IInterface) bVar3);
        mo30133b(22, z);
    }
}
