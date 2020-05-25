package com.google.android.gms.maps.p1046a;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p1045f.C16494d;
import com.google.android.gms.internal.p1045f.C16499i;

/* renamed from: com.google.android.gms.maps.a.m */
public abstract class C16922m extends C16494d implements C16921l {
    public C16922m() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    /* renamed from: a */
    public final boolean mo31702a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        boolean a = mo32654a(C16499i.m39371a(parcel.readStrongBinder()));
        parcel2.writeNoException();
        parcel2.writeInt(a ? 1 : 0);
        return true;
    }
}
