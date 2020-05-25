package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.zk */
public final class C16428zk extends bgo implements C16427zj {
    C16428zk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    /* renamed from: a */
    public final String mo31541a() throws RemoteException {
        Parcel a = mo30131a(1, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final int mo31542b() throws RemoteException {
        Parcel a = mo30131a(2, mo30134z());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
