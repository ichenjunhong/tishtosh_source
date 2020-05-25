package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.auth-api.C16445b;

/* renamed from: com.google.android.gms.auth.api.signin.internal.p */
public abstract class C15161p extends C16445b implements C15160o {
    public C15161p() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    /* renamed from: a */
    public final boolean mo27974a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo27972a();
                break;
            case 2:
                mo27973b();
                break;
            default:
                return false;
        }
        return true;
    }
}
