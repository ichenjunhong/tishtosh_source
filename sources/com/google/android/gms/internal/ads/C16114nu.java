package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.measurement.C15047c;

/* renamed from: com.google.android.gms.internal.ads.nu */
final /* synthetic */ class C16114nu implements Runnable {

    /* renamed from: a */
    private final Context f45268a;

    /* renamed from: b */
    private final C16113nt f45269b;

    C16114nu(Context context, C16113nt ntVar) {
        this.f45268a = context;
        this.f45269b = ntVar;
    }

    public final void run() {
        Context context = this.f45268a;
        try {
            ((C15047c) afd.m32802b(context, "com.google.android.gms.ads.measurement.MeasurementManager", C16115nv.f45270a)).registerAppMeasurementProxy(this.f45269b);
        } catch (RemoteException | aff | NullPointerException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }
}
