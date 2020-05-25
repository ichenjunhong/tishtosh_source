package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class cap extends bgp implements cao {
    public cap() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo27642a((zzyv) bgq.m35594a(parcel, zzyv.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                String a = mo27641a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 3:
                boolean c = mo27645c();
                parcel2.writeNoException();
                bgq.m35597a(parcel2, c);
                break;
            case 4:
                String b = mo27644b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                break;
            case 5:
                mo27643a((zzyv) bgq.m35594a(parcel, zzyv.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
