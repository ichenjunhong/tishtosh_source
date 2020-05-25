package com.google.android.gms.maps.p1046a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.p1045f.C16491a;
import com.google.android.gms.internal.p1045f.C16495e;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14882b.C14883a;

/* renamed from: com.google.android.gms.maps.a.v */
public final class C16931v extends C16491a implements C16912c {
    C16931v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    /* renamed from: O_ */
    public final void mo32641O_() throws RemoteException {
        mo31701b(3, mo31698a());
    }

    /* renamed from: a */
    public final void mo32642a(Bundle bundle) throws RemoteException {
        Parcel a = mo31698a();
        C16495e.m39364a(a, (Parcelable) bundle);
        mo31701b(2, a);
    }

    /* renamed from: a */
    public final void mo32643a(C16919j jVar) throws RemoteException {
        Parcel a = mo31698a();
        C16495e.m39363a(a, (IInterface) jVar);
        mo31701b(9, a);
    }

    /* renamed from: b */
    public final void mo32644b() throws RemoteException {
        mo31701b(4, mo31698a());
    }

    /* renamed from: b */
    public final void mo32645b(Bundle bundle) throws RemoteException {
        Parcel a = mo31698a();
        C16495e.m39364a(a, (Parcelable) bundle);
        Parcel a2 = mo31699a(7, a);
        if (a2.readInt() != 0) {
            bundle.readFromParcel(a2);
        }
        a2.recycle();
    }

    /* renamed from: c */
    public final void mo32646c() throws RemoteException {
        mo31701b(5, mo31698a());
    }

    /* renamed from: d */
    public final void mo32647d() throws RemoteException {
        mo31701b(6, mo31698a());
    }

    /* renamed from: e */
    public final C14882b mo32648e() throws RemoteException {
        Parcel a = mo31699a(8, mo31698a());
        C14882b a2 = C14883a.m30535a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: f */
    public final void mo32649f() throws RemoteException {
        mo31701b(12, mo31698a());
    }

    /* renamed from: g */
    public final void mo32650g() throws RemoteException {
        mo31701b(13, mo31698a());
    }
}
