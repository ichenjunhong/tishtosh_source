package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.rs */
final /* synthetic */ class C16220rs implements afe {

    /* renamed from: a */
    static final afe f45522a = new C16220rs();

    private C16220rs() {
    }

    /* renamed from: a */
    public final Object mo28772a(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.omid.IOmid");
        if (queryLocalInterface instanceof aoj) {
            return (aoj) queryLocalInterface;
        }
        return new aok(iBinder);
    }
}
