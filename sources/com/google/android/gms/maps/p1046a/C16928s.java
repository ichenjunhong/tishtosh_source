package com.google.android.gms.maps.p1046a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.p1045f.C16491a;
import com.google.android.gms.internal.p1045f.C16495e;
import com.google.android.gms.internal.p1045f.C16498h;
import com.google.android.gms.internal.p1045f.C16499i;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.p1027a.C14882b;

/* renamed from: com.google.android.gms.maps.a.s */
public final class C16928s extends C16491a implements C16911b {
    C16928s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    /* renamed from: a */
    public final C16498h mo32634a(MarkerOptions markerOptions) throws RemoteException {
        Parcel a = mo31698a();
        C16495e.m39364a(a, (Parcelable) markerOptions);
        Parcel a2 = mo31699a(11, a);
        C16498h a3 = C16499i.m39371a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    /* renamed from: a */
    public final void mo32635a(C14882b bVar) throws RemoteException {
        Parcel a = mo31698a();
        C16495e.m39363a(a, (IInterface) bVar);
        mo31701b(4, a);
    }

    /* renamed from: a */
    public final void mo32636a(C16915f fVar) throws RemoteException {
        Parcel a = mo31698a();
        C16495e.m39363a(a, (IInterface) fVar);
        mo31701b(32, a);
    }

    /* renamed from: a */
    public final void mo32637a(C16917h hVar) throws RemoteException {
        Parcel a = mo31698a();
        C16495e.m39363a(a, (IInterface) hVar);
        mo31701b(28, a);
    }

    /* renamed from: a */
    public final void mo32638a(C16921l lVar) throws RemoteException {
        Parcel a = mo31698a();
        C16495e.m39363a(a, (IInterface) lVar);
        mo31701b(30, a);
    }

    /* renamed from: a */
    public final void mo32639a(C16929t tVar) throws RemoteException {
        Parcel a = mo31698a();
        C16495e.m39363a(a, (IInterface) tVar);
        mo31701b(33, a);
    }

    /* renamed from: b */
    public final void mo32640b(C14882b bVar) throws RemoteException {
        Parcel a = mo31698a();
        C16495e.m39363a(a, (IInterface) bVar);
        mo31701b(5, a);
    }
}
