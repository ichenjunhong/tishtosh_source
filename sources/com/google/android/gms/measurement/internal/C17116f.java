package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.measurement.internal.f */
public final class C17116f implements Creator<zzad> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzad[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            if (C15467a.m32142a(a) != 2) {
                C15467a.m32149b(parcel, a);
            } else {
                bundle = C15467a.m32165p(parcel, a);
            }
        }
        C15467a.m32173x(parcel, b);
        return new zzad(bundle);
    }
}
