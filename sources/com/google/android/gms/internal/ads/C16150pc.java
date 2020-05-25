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

/* renamed from: com.google.android.gms.internal.ads.pc */
public final class C16150pc extends bgo implements C16148pa {
    C16150pc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    /* renamed from: a */
    public final String mo31268a() throws RemoteException {
        Parcel a = mo30131a(2, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final List mo31271b() throws RemoteException {
        Parcel a = mo30131a(3, mo30134z());
        ArrayList b = bgq.m35599b(a);
        a.recycle();
        return b;
    }

    /* renamed from: c */
    public final String mo31273c() throws RemoteException {
        Parcel a = mo30131a(4, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: d */
    public final C15865eo mo31275d() throws RemoteException {
        Parcel a = mo30131a(5, mo30134z());
        C15865eo a2 = C15866ep.m37470a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: e */
    public final String mo31276e() throws RemoteException {
        Parcel a = mo30131a(6, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: f */
    public final double mo31277f() throws RemoteException {
        Parcel a = mo30131a(7, mo30134z());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    /* renamed from: g */
    public final String mo31278g() throws RemoteException {
        Parcel a = mo30131a(8, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: h */
    public final String mo31279h() throws RemoteException {
        Parcel a = mo30131a(9, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: i */
    public final void mo31280i() throws RemoteException {
        mo30133b(10, mo30134z());
    }

    /* renamed from: a */
    public final void mo31269a(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(11, z);
    }

    /* renamed from: b */
    public final void mo31272b(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(12, z);
    }

    /* renamed from: j */
    public final boolean mo31281j() throws RemoteException {
        Parcel a = mo30131a(13, mo30134z());
        boolean a2 = bgq.m35598a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: k */
    public final boolean mo31282k() throws RemoteException {
        Parcel a = mo30131a(14, mo30134z());
        boolean a2 = bgq.m35598a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: l */
    public final Bundle mo31283l() throws RemoteException {
        Parcel a = mo30131a(15, mo30134z());
        Bundle bundle = (Bundle) bgq.m35594a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: c */
    public final void mo31274c(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(16, z);
    }

    /* renamed from: m */
    public final C15583ak mo31284m() throws RemoteException {
        Parcel a = mo30131a(17, mo30134z());
        C15583ak a2 = C15584al.m33192a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: n */
    public final C14882b mo31285n() throws RemoteException {
        Parcel a = mo30131a(18, mo30134z());
        C14882b a2 = C14883a.m30535a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: o */
    public final C15861ek mo31286o() throws RemoteException {
        Parcel a = mo30131a(19, mo30134z());
        C15861ek a2 = C15862el.m37462a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: p */
    public final C14882b mo31287p() throws RemoteException {
        Parcel a = mo30131a(20, mo30134z());
        C14882b a2 = C14883a.m30535a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: q */
    public final C14882b mo31288q() throws RemoteException {
        Parcel a = mo30131a(21, mo30134z());
        C14882b a2 = C14883a.m30535a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo31270a(C14882b bVar, C14882b bVar2, C14882b bVar3) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        bgq.m35595a(z, (IInterface) bVar2);
        bgq.m35595a(z, (IInterface) bVar3);
        mo30133b(22, z);
    }
}
