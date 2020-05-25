package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.ck */
public abstract class C16594ck extends C16656ek implements C16593cj {
    public C16594ck() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo31893a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo31892a((Bundle) C16666eu.m39818a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
