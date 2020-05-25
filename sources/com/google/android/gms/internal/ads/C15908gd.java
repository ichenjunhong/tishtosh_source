package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;

/* renamed from: com.google.android.gms.internal.ads.gd */
public final class C15908gd extends bgo implements C15907gc {
    C15908gd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    /* renamed from: a */
    public final void mo31080a(C15931h hVar, C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) hVar);
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(1, z);
    }
}
