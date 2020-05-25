package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.jk */
public final class C15996jk extends bgo implements C15994ji {
    C15996jk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    /* renamed from: a */
    public final void mo31112a(C15990je jeVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) jeVar);
        mo30133b(1, z);
    }

    /* renamed from: a */
    public final void mo31111a(int i) throws RemoteException {
        Parcel z = mo30134z();
        z.writeInt(i);
        mo30133b(2, z);
    }
}
