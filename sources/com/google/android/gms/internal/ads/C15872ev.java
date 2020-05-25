package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14882b.C14883a;

/* renamed from: com.google.android.gms.internal.ads.ev */
public final class C15872ev extends bgo implements C15870et {
    C15872ev(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* renamed from: a */
    public final void mo31058a(String str, C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(1, z);
    }

    /* renamed from: a */
    public final C14882b mo31054a(String str) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        Parcel a = mo30131a(2, z);
        C14882b a2 = C14883a.m30535a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo31056a(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(3, z);
    }

    /* renamed from: a */
    public final void mo31055a() throws RemoteException {
        mo30133b(4, mo30134z());
    }

    /* renamed from: a */
    public final void mo31057a(C14882b bVar, int i) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        z.writeInt(i);
        mo30133b(5, z);
    }

    /* renamed from: b */
    public final void mo31060b(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(6, z);
    }
}
