package com.google.android.gms.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.location.C16501a;
import com.google.android.gms.internal.location.C16525w;

/* renamed from: com.google.android.gms.location.ai */
public final class C16878ai extends C16501a implements C16876ag {
    public C16878ai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationCallback");
    }

    /* renamed from: a */
    public final void mo31725a(LocationAvailability locationAvailability) throws RemoteException {
        Parcel a = mo31710a();
        C16525w.m39403a(a, (Parcelable) locationAvailability);
        mo31713b(2, a);
    }

    /* renamed from: a */
    public final void mo31726a(LocationResult locationResult) throws RemoteException {
        Parcel a = mo31710a();
        C16525w.m39403a(a, (Parcelable) locationResult);
        mo31713b(1, a);
    }
}
