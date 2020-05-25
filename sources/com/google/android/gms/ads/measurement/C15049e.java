package com.google.android.gms.ads.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.bgo;
import com.google.android.gms.internal.ads.bgq;

/* renamed from: com.google.android.gms.ads.measurement.e */
public final class C15049e extends bgo implements C15047c {
    C15049e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    public final void registerAppMeasurementProxy(C15044a aVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) aVar);
        mo30133b(1, z);
    }
}
