package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class cam extends bgp implements cal {
    public cam() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo30869a();
                break;
            case 2:
                mo30870a(parcel.readInt());
                break;
            case 3:
                mo30871b();
                break;
            case 4:
                mo30872c();
                break;
            case 5:
                mo30873d();
                break;
            case 6:
                mo30875f();
                break;
            case 7:
                mo30874e();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
