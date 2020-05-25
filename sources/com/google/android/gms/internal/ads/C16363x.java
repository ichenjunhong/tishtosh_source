package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.x */
public final class C16363x extends bgo implements C16309v {
    C16363x(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
    }

    /* renamed from: a */
    public final long mo30892a() throws RemoteException {
        Parcel a = mo30131a(1, mo30134z());
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }
}
