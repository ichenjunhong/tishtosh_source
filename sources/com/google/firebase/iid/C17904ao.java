package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.google.firebase.iid.ao */
final class C17904ao implements Creator<zzl> {
    C17904ao() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzl[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            return new zzl(readStrongBinder);
        }
        return null;
    }
}
