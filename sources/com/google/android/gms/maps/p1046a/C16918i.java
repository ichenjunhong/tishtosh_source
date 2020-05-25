package com.google.android.gms.maps.p1046a;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p1045f.C16494d;
import com.google.android.gms.internal.p1045f.C16495e;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: com.google.android.gms.maps.a.i */
public abstract class C16918i extends C16494d implements C16917h {
    public C16918i() {
        super("com.google.android.gms.maps.internal.IOnMapClickListener");
    }

    /* renamed from: a */
    public final boolean mo31702a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo32652a((LatLng) C16495e.m39362a(parcel, LatLng.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
