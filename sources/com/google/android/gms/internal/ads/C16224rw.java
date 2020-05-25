package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;

/* renamed from: com.google.android.gms.internal.ads.rw */
public final class C16224rw extends bgo implements C16222ru {
    C16224rw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    /* renamed from: a */
    public final void mo27672a(Bundle bundle) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) bundle);
        mo30133b(1, z);
    }

    /* renamed from: f */
    public final void mo27681f() throws RemoteException {
        mo30133b(2, mo30134z());
    }

    /* renamed from: g */
    public final void mo27682g() throws RemoteException {
        mo30133b(3, mo30134z());
    }

    /* renamed from: h */
    public final void mo27683h() throws RemoteException {
        mo30133b(4, mo30134z());
    }

    /* renamed from: i */
    public final void mo27684i() throws RemoteException {
        mo30133b(5, mo30134z());
    }

    /* renamed from: b */
    public final void mo27677b(Bundle bundle) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) bundle);
        Parcel a = mo30131a(6, z);
        if (a.readInt() != 0) {
            bundle.readFromParcel(a);
        }
        a.recycle();
    }

    /* renamed from: j */
    public final void mo27685j() throws RemoteException {
        mo30133b(7, mo30134z());
    }

    /* renamed from: k */
    public final void mo27686k() throws RemoteException {
        mo30133b(8, mo30134z());
    }

    /* renamed from: l */
    public final void mo27687l() throws RemoteException {
        mo30133b(9, mo30134z());
    }

    /* renamed from: d */
    public final void mo27679d() throws RemoteException {
        mo30133b(10, mo30134z());
    }

    /* renamed from: e */
    public final boolean mo27680e() throws RemoteException {
        Parcel a = mo30131a(11, mo30134z());
        boolean a2 = bgq.m35598a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo27671a(int i, int i2, Intent intent) throws RemoteException {
        Parcel z = mo30134z();
        z.writeInt(i);
        z.writeInt(i2);
        bgq.m35596a(z, (Parcelable) intent);
        mo30133b(12, z);
    }

    /* renamed from: a */
    public final void mo27674a(C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(13, z);
    }
}
