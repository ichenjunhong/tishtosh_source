package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.xw */
public abstract class C16386xw extends bgp implements C16385xv {
    public C16386xw() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String a = mo31475a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 2:
                int b = mo31476b();
                parcel2.writeNoException();
                parcel2.writeInt(b);
                break;
            default:
                return false;
        }
        return true;
    }
}
