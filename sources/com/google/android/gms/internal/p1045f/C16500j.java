package com.google.android.gms.internal.p1045f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.f.j */
public final class C16500j extends C16491a implements C16498h {
    C16500j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    /* renamed from: M_ */
    public final void mo31706M_() throws RemoteException {
        mo31701b(1, mo31698a());
    }

    /* renamed from: b */
    public final void mo31708b() throws RemoteException {
        mo31701b(11, mo31698a());
    }

    /* renamed from: c */
    public final int mo31709c() throws RemoteException {
        Parcel a = mo31699a(17, mo31698a());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: a */
    public final boolean mo31707a(C16498h hVar) throws RemoteException {
        Parcel a = mo31698a();
        C16495e.m39363a(a, (IInterface) hVar);
        Parcel a2 = mo31699a(16, a);
        boolean z = a2.readInt() != 0;
        a2.recycle();
        return z;
    }
}
