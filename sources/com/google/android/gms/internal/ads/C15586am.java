package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.am */
public final class C15586am extends bgo implements C15583ak {
    C15586am(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* renamed from: a */
    public final void mo29062a() throws RemoteException {
        mo30133b(1, mo30134z());
    }

    /* renamed from: b */
    public final void mo29065b() throws RemoteException {
        mo30133b(2, mo30134z());
    }

    /* renamed from: a */
    public final void mo29064a(boolean z) throws RemoteException {
        Parcel z2 = mo30134z();
        bgq.m35597a(z2, z);
        mo30133b(3, z2);
    }

    /* renamed from: c */
    public final boolean mo29066c() throws RemoteException {
        Parcel a = mo30131a(4, mo30134z());
        boolean a2 = bgq.m35598a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: d */
    public final int mo29067d() throws RemoteException {
        Parcel a = mo30131a(5, mo30134z());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: e */
    public final float mo29068e() throws RemoteException {
        Parcel a = mo30131a(6, mo30134z());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    /* renamed from: f */
    public final float mo29069f() throws RemoteException {
        Parcel a = mo30131a(7, mo30134z());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    /* renamed from: a */
    public final void mo29063a(C15606an anVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) anVar);
        mo30133b(8, z);
    }

    /* renamed from: g */
    public final float mo29070g() throws RemoteException {
        Parcel a = mo30131a(9, mo30134z());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    /* renamed from: h */
    public final boolean mo29071h() throws RemoteException {
        Parcel a = mo30131a(10, mo30134z());
        boolean a2 = bgq.m35598a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: i */
    public final C15606an mo29072i() throws RemoteException {
        C15606an anVar;
        Parcel a = mo30131a(11, mo30134z());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            anVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            if (queryLocalInterface instanceof C15606an) {
                anVar = (C15606an) queryLocalInterface;
            } else {
                anVar = new C15612ap(readStrongBinder);
            }
        }
        a.recycle();
        return anVar;
    }

    /* renamed from: j */
    public final boolean mo29073j() throws RemoteException {
        Parcel a = mo30131a(12, mo30134z());
        boolean a2 = bgq.m35598a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: k */
    public final void mo29074k() throws RemoteException {
        mo30133b(13, mo30134z());
    }
}
