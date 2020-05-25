package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.location.C16501a;
import com.google.android.gms.internal.location.C16525w;

/* renamed from: com.google.android.gms.location.al */
public final class C16881al extends C16501a implements C16879aj {
    public C16881al(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationListener");
    }

    /* renamed from: a */
    public final void mo31727a(Location location) throws RemoteException {
        Parcel a = mo31710a();
        C16525w.m39403a(a, (Parcelable) location);
        mo31713b(1, a);
    }
}
