package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.oq */
public final class C16137oq extends bgo implements C16134on {
    C16137oq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* renamed from: a */
    public final C16138or mo31234a(String str) throws RemoteException {
        C16138or orVar;
        Parcel z = mo30134z();
        z.writeString(str);
        Parcel a = mo30131a(1, z);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            orVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (queryLocalInterface instanceof C16138or) {
                orVar = (C16138or) queryLocalInterface;
            } else {
                orVar = new C16140ot(readStrongBinder);
            }
        }
        a.recycle();
        return orVar;
    }

    /* renamed from: b */
    public final boolean mo31235b(String str) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        Parcel a = mo30131a(2, z);
        boolean a2 = bgq.m35598a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: c */
    public final C16186ql mo31236c(String str) throws RemoteException {
        C16186ql qlVar;
        Parcel z = mo30134z();
        z.writeString(str);
        Parcel a = mo30131a(3, z);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            qlVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
            if (queryLocalInterface instanceof C16186ql) {
                qlVar = (C16186ql) queryLocalInterface;
            } else {
                qlVar = new C16188qn(readStrongBinder);
            }
        }
        a.recycle();
        return qlVar;
    }
}
