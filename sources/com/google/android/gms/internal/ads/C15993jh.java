package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.jh */
public final class C15993jh extends bgo implements C15992jg {
    C15993jh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    /* renamed from: a */
    public final void mo31109a() throws RemoteException {
        mo30133b(1, mo30134z());
    }

    /* renamed from: a */
    public final void mo31110a(int i) throws RemoteException {
        Parcel z = mo30134z();
        z.writeInt(i);
        mo30133b(2, z);
    }
}
