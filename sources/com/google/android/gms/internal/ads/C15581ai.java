package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ai */
public final class C15581ai extends bgo implements C15573ag {
    C15581ai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    /* renamed from: a */
    public final String mo28808a() throws RemoteException {
        Parcel a = mo30131a(1, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
