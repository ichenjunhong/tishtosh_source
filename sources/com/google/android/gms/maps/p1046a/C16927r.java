package com.google.android.gms.maps.p1046a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.p1045f.C16491a;
import com.google.android.gms.internal.p1045f.C16495e;
import com.google.android.gms.internal.p1045f.C16496f;
import com.google.android.gms.internal.p1045f.C16497g;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.p1027a.C14882b;

/* renamed from: com.google.android.gms.maps.a.r */
public final class C16927r extends C16491a implements C16926q {
    C16927r(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    /* renamed from: N_ */
    public final C16910a mo32655N_() throws RemoteException {
        C16910a aVar;
        Parcel a = mo31699a(4, mo31698a());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            aVar = queryLocalInterface instanceof C16910a ? (C16910a) queryLocalInterface : new C16923n(readStrongBinder);
        }
        a.recycle();
        return aVar;
    }

    /* renamed from: a */
    public final C16912c mo32656a(C14882b bVar, GoogleMapOptions googleMapOptions) throws RemoteException {
        C16912c cVar;
        Parcel a = mo31698a();
        C16495e.m39363a(a, (IInterface) bVar);
        C16495e.m39364a(a, (Parcelable) googleMapOptions);
        Parcel a2 = mo31699a(3, a);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            cVar = queryLocalInterface instanceof C16912c ? (C16912c) queryLocalInterface : new C16931v(readStrongBinder);
        }
        a2.recycle();
        return cVar;
    }

    /* renamed from: a */
    public final void mo32657a(C14882b bVar, int i) throws RemoteException {
        Parcel a = mo31698a();
        C16495e.m39363a(a, (IInterface) bVar);
        a.writeInt(i);
        mo31701b(6, a);
    }

    /* renamed from: b */
    public final C16496f mo32658b() throws RemoteException {
        C16496f fVar;
        Parcel a = mo31699a(5, mo31698a());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            fVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            fVar = queryLocalInterface instanceof C16496f ? (C16496f) queryLocalInterface : new C16497g(readStrongBinder);
        }
        a.recycle();
        return fVar;
    }
}
