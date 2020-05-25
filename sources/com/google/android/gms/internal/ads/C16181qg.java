package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.qg */
public final class C16181qg extends bgo implements C16180qf {
    C16181qg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    /* renamed from: a */
    public final void mo31333a(String str) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        mo30133b(2, z);
    }
}
