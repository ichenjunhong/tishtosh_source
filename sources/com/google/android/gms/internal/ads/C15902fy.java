package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.fy */
public final class C15902fy extends bgo implements C15900fw {
    C15902fy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    /* renamed from: a */
    public final void mo31078a(C15889fl flVar, String str) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) flVar);
        z.writeString(str);
        mo30133b(1, z);
    }
}
