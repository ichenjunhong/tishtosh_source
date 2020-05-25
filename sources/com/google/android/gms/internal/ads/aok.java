package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14882b.C14883a;

public final class aok extends bgo implements aoj {
    aok(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    /* renamed from: a */
    public final boolean mo29421a(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        Parcel a = mo30131a(2, z);
        boolean a2 = bgq.m35598a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final void mo29422b(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(4, z);
    }

    /* renamed from: a */
    public final void mo29420a(C14882b bVar, C14882b bVar2) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        bgq.m35595a(z, (IInterface) bVar2);
        mo30133b(5, z);
    }

    /* renamed from: a */
    public final String mo29419a() throws RemoteException {
        Parcel a = mo30131a(6, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final void mo29423c(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(7, z);
    }

    /* renamed from: a */
    public final C14882b mo29418a(String str, C14882b bVar, String str2, String str3, String str4, String str5) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        bgq.m35595a(z, (IInterface) bVar);
        z.writeString(str2);
        z.writeString(str3);
        z.writeString(str4);
        z.writeString(str5);
        Parcel a = mo30131a(9, z);
        C14882b a2 = C14883a.m30535a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
