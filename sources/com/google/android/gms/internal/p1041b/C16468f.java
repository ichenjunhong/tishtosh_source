package com.google.android.gms.internal.p1041b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.b.f */
public abstract class C16468f extends C16464b implements C16467e {
    public C16468f() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo31676a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo31680a((Status) (parcel.readInt() == 0 ? null : (Parcelable) Status.CREATOR.createFromParcel(parcel)));
        return true;
    }
}
