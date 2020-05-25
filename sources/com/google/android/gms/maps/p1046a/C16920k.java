package com.google.android.gms.maps.p1046a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p1045f.C16494d;

/* renamed from: com.google.android.gms.maps.a.k */
public abstract class C16920k extends C16494d implements C16919j {
    public C16920k() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    /* renamed from: a */
    public final boolean mo31702a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C16911b bVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            bVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            bVar = queryLocalInterface instanceof C16911b ? (C16911b) queryLocalInterface : new C16928s(readStrongBinder);
        }
        mo32653a(bVar);
        parcel2.writeNoException();
        return true;
    }
}
