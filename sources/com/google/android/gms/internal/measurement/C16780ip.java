package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.ip */
public final class C16780ip extends C16655ej implements C16719go {
    public C16780ip(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    /* renamed from: a */
    public final Bundle mo32189a(Bundle bundle) throws RemoteException {
        Parcel a = mo31965a();
        C16666eu.m39820a(a, (Parcelable) bundle);
        Parcel a2 = mo31966a(1, a);
        Bundle bundle2 = (Bundle) C16666eu.m39818a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle2;
    }
}
