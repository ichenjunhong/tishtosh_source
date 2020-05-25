package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.op */
public abstract class C16136op extends bgp implements C16134on {
    public C16136op() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* renamed from: a */
    public static C16134on m38207a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        if (queryLocalInterface instanceof C16134on) {
            return (C16134on) queryLocalInterface;
        }
        return new C16137oq(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                C16138or a = mo31234a(parcel.readString());
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) a);
                break;
            case 2:
                boolean b = mo31235b(parcel.readString());
                parcel2.writeNoException();
                bgq.m35597a(parcel2, b);
                break;
            case 3:
                C16186ql c = mo31236c(parcel.readString());
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) c);
                break;
            default:
                return false;
        }
        return true;
    }
}
