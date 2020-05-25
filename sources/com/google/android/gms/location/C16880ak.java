package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.C16519q;
import com.google.android.gms.internal.location.C16525w;

/* renamed from: com.google.android.gms.location.ak */
public abstract class C16880ak extends C16519q implements C16879aj {
    /* renamed from: a */
    public final boolean mo31719a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo31727a((Location) C16525w.m39402a(parcel, Location.CREATOR));
        return true;
    }
}
