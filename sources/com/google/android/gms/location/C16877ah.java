package com.google.android.gms.location;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.C16519q;
import com.google.android.gms.internal.location.C16525w;

/* renamed from: com.google.android.gms.location.ah */
public abstract class C16877ah extends C16519q implements C16876ag {
    public C16877ah() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    /* renamed from: a */
    public final boolean mo31719a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo31726a((LocationResult) C16525w.m39402a(parcel, LocationResult.CREATOR));
                break;
            case 2:
                mo31725a((LocationAvailability) C16525w.m39402a(parcel, LocationAvailability.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}
