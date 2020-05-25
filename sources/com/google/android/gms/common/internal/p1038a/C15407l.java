package com.google.android.gms.common.internal.p1038a;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p1042c.C16475b;

/* renamed from: com.google.android.gms.common.internal.a.l */
public abstract class C15407l extends C16475b implements C15406k {
    public C15407l() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    /* renamed from: a */
    public final boolean mo28366a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo28364a(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
