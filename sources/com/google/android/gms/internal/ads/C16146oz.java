package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.oz */
public final class C16146oz extends bgo implements C16144ox {
    C16146oz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    /* renamed from: a */
    public final int mo31230a() throws RemoteException {
        Parcel a = mo30131a(1, mo30134z());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
