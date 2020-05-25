package com.google.android.gms.maps.p1046a;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p1045f.C16494d;
import com.google.android.gms.internal.p1045f.C16495e;
import com.google.android.gms.internal.p1045f.C16499i;
import com.google.android.gms.p1027a.C14882b;

/* renamed from: com.google.android.gms.maps.a.u */
public abstract class C16930u extends C16494d implements C16929t {
    public C16930u() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    /* renamed from: a */
    public final boolean mo31702a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C14882b bVar;
        switch (i) {
            case 1:
                bVar = mo32659a(C16499i.m39371a(parcel.readStrongBinder()));
                break;
            case 2:
                bVar = mo32660b(C16499i.m39371a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        C16495e.m39363a(parcel2, (IInterface) bVar);
        return true;
    }
}
