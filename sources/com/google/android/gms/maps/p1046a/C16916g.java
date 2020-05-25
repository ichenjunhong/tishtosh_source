package com.google.android.gms.maps.p1046a;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p1045f.C16494d;
import com.google.android.gms.internal.p1045f.C16499i;

/* renamed from: com.google.android.gms.maps.a.g */
public abstract class C16916g extends C16494d implements C16915f {
    public C16916g() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
    }

    /* renamed from: a */
    public final boolean mo31702a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo32651a(C16499i.m39371a(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
