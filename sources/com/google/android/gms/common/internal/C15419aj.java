package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p1043d.C16480b;
import com.google.android.gms.internal.p1043d.C16481c;
import com.google.android.gms.p1027a.C14882b;

/* renamed from: com.google.android.gms.common.internal.aj */
public abstract class C15419aj extends C16480b implements C15418ai {
    public C15419aj() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: a */
    public final boolean mo28389a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                C14882b a = mo28387a();
                parcel2.writeNoException();
                C16481c.m39348a(parcel2, (IInterface) a);
                break;
            case 2:
                int b = mo28388b();
                parcel2.writeNoException();
                parcel2.writeInt(b);
                break;
            default:
                return false;
        }
        return true;
    }
}
