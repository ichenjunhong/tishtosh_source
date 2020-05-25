package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.xx */
public final class C16387xx extends bgo implements C16385xv {
    C16387xx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    /* renamed from: a */
    public final String mo31475a() throws RemoteException {
        Parcel a = mo30131a(1, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final int mo31476b() throws RemoteException {
        Parcel a = mo30131a(2, mo30134z());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
