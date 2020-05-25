package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.location.h */
public final class C16510h extends C16501a implements C16509g {
    C16510h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    /* renamed from: a */
    public final void mo31720a(zzbf zzbf) throws RemoteException {
        Parcel a = mo31710a();
        C16525w.m39403a(a, (Parcelable) zzbf);
        mo31711a(59, a);
    }

    /* renamed from: a */
    public final void mo31721a(zzo zzo) throws RemoteException {
        Parcel a = mo31710a();
        C16525w.m39403a(a, (Parcelable) zzo);
        mo31711a(75, a);
    }

    /* renamed from: a */
    public final void mo31722a(boolean z) throws RemoteException {
        Parcel a = mo31710a();
        a.writeInt(z ? 1 : 0);
        mo31711a(12, a);
    }
}
