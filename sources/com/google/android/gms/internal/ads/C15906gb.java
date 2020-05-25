package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.gb */
public final class C15906gb extends bgo implements C15903fz {
    C15906gb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    /* renamed from: a */
    public final void mo31079a(C15889fl flVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) flVar);
        mo30133b(1, z);
    }
}
