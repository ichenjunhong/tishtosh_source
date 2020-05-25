package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.qe */
public final class C16179qe extends bgo implements C16178qd {
    C16179qe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    /* renamed from: a */
    public final void mo31332a(String str) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        mo30133b(3, z);
    }
}
