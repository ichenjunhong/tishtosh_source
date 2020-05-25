package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;

/* renamed from: com.google.android.gms.internal.ads.g */
public final class C15904g extends bgo implements C15877f {
    C15904g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    /* renamed from: a */
    public final IBinder mo31074a(C14882b bVar, String str, C16134on onVar, int i) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        z.writeString(str);
        bgq.m35595a(z, (IInterface) onVar);
        z.writeInt(15302000);
        Parcel a = mo30131a(1, z);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
