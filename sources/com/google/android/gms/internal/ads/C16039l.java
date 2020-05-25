package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;

/* renamed from: com.google.android.gms.internal.ads.l */
public final class C16039l extends bgo implements C16012k {
    C16039l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    /* renamed from: a */
    public final IBinder mo31118a(C14882b bVar, zzyz zzyz, String str, C16134on onVar, int i, int i2) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        bgq.m35596a(z, (Parcelable) zzyz);
        z.writeString(str);
        bgq.m35595a(z, (IInterface) onVar);
        z.writeInt(15302000);
        z.writeInt(i2);
        Parcel a = mo30131a(2, z);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
