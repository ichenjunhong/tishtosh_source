package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.xz */
public final class C16389xz extends bgo implements C16388xy {
    C16389xz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    /* renamed from: a */
    public final void mo31507a(C16385xv xvVar, String str, String str2) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) xvVar);
        z.writeString(str);
        z.writeString(str2);
        mo30133b(2, z);
    }
}
