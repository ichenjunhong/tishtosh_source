package com.google.android.gms.ads.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.bgp;

/* renamed from: com.google.android.gms.ads.measurement.d */
public abstract class C15048d extends bgp implements C15047c {
    public C15048d() {
        super("com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    public static C15047c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        if (queryLocalInterface instanceof C15047c) {
            return (C15047c) queryLocalInterface;
        }
        return new C15049e(iBinder);
    }

    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C15044a aVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
            if (queryLocalInterface instanceof C15044a) {
                aVar = (C15044a) queryLocalInterface;
            } else {
                aVar = new C15046b(readStrongBinder);
            }
        }
        registerAppMeasurementProxy(aVar);
        parcel2.writeNoException();
        return true;
    }
}
