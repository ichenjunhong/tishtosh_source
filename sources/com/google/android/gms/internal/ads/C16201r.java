package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.r */
public final class C16201r extends bgo implements C16147p {
    public C16201r(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    /* renamed from: a */
    public final void mo30883a(String str, String str2) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        z.writeString(str2);
        mo30133b(1, z);
    }
}
