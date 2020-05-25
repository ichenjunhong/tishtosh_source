package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

public final class bxm implements Creator<zzwo> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzwo[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            if (C15467a.m32142a(a) != 2) {
                C15467a.m32149b(parcel, a);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) C15467a.m32145a(parcel, a, ParcelFileDescriptor.CREATOR);
            }
        }
        C15467a.m32173x(parcel, b);
        return new zzwo(parcelFileDescriptor);
    }
}
