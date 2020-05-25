package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;

public final class bgt extends bgo implements bgr {
    bgt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    /* renamed from: a */
    public final void mo30139a(C14882b bVar, String str) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        z.writeString(str);
        mo30133b(2, z);
    }

    /* renamed from: a */
    public final void mo30137a() throws RemoteException {
        mo30133b(3, mo30134z());
    }

    /* renamed from: a */
    public final void mo30142a(int[] iArr) throws RemoteException {
        Parcel z = mo30134z();
        z.writeIntArray(null);
        mo30133b(4, z);
    }

    /* renamed from: a */
    public final void mo30141a(byte[] bArr) throws RemoteException {
        Parcel z = mo30134z();
        z.writeByteArray(bArr);
        mo30133b(5, z);
    }

    /* renamed from: a */
    public final void mo30138a(int i) throws RemoteException {
        Parcel z = mo30134z();
        z.writeInt(i);
        mo30133b(6, z);
    }

    /* renamed from: b */
    public final void mo30143b(int i) throws RemoteException {
        Parcel z = mo30134z();
        z.writeInt(i);
        mo30133b(7, z);
    }

    /* renamed from: a */
    public final void mo30140a(C14882b bVar, String str, String str2) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        z.writeString(str);
        z.writeString(null);
        mo30133b(8, z);
    }
}
