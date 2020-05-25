package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14882b.C14883a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.fn */
public final class C15891fn extends bgo implements C15889fl {
    C15891fn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* renamed from: a */
    public final String mo30969a(String str) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        Parcel a = mo30131a(1, z);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final C15865eo mo30972b(String str) throws RemoteException {
        C15865eo eoVar;
        Parcel z = mo30134z();
        z.writeString(str);
        Parcel a = mo30131a(2, z);
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

    /* renamed from: a */
    public final List<String> mo30970a() throws RemoteException {
        Parcel a = mo30131a(3, mo30134z());
        ArrayList createStringArrayList = a.createStringArrayList();
        a.recycle();
        return createStringArrayList;
    }

    /* renamed from: c */
    public final String mo30921c() throws RemoteException {
        Parcel a = mo30131a(4, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final void mo30973c(String str) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        mo30133b(5, z);
    }

    /* renamed from: h */
    public final void mo30976h() throws RemoteException {
        mo30133b(6, mo30134z());
    }

    /* renamed from: g */
    public final C15583ak mo30975g() throws RemoteException {
        Parcel a = mo30131a(7, mo30134z());
        C15583ak a2 = C15584al.m33192a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: j */
    public final void mo30978j() throws RemoteException {
        mo30133b(8, mo30134z());
    }

    /* renamed from: i */
    public final C14882b mo30977i() throws RemoteException {
        Parcel a = mo30131a(9, mo30134z());
        C14882b a2 = C14883a.m30535a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final boolean mo30971a(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        Parcel a = mo30131a(10, z);
        boolean a2 = bgq.m35598a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: f */
    public final C14882b mo30974f() throws RemoteException {
        Parcel a = mo30131a(11, mo30134z());
        C14882b a2 = C14883a.m30535a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
