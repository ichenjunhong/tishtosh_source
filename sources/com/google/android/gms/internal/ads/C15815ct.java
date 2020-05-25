package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ct */
public final class C15815ct extends bgo implements C15813cr {
    C15815ct(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    /* renamed from: a */
    public final void mo30910a(C15809cn cnVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) cnVar);
        mo30133b(1, z);
    }
}
