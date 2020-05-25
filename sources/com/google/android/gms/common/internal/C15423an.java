package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.zzk;
import com.google.android.gms.internal.p1043d.C16479a;
import com.google.android.gms.internal.p1043d.C16481c;
import com.google.android.gms.p1027a.C14882b;

/* renamed from: com.google.android.gms.common.internal.an */
public final class C15423an extends C16479a implements C15422am {
    public C15423an(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    /* renamed from: a */
    public final boolean mo28393a(zzk zzk, C14882b bVar) throws RemoteException {
        Parcel c = mo31690c();
        C16481c.m39349a(c, (Parcelable) zzk);
        C16481c.m39348a(c, (IInterface) bVar);
        Parcel a = mo31687a(5, c);
        boolean z = a.readInt() != 0;
        a.recycle();
        return z;
    }
}
