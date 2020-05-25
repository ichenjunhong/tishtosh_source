package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.gg */
public final class C15911gg extends bgo implements C15909ge {
    C15911gg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    /* renamed from: a */
    public final void mo31081a(C15914gj gjVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) gjVar);
        mo30133b(1, z);
    }
}
