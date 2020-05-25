package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.maps.model.l */
public final class C16963l implements Creator<MapStyleOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            if (C15467a.m32142a(a) != 2) {
                C15467a.m32149b(parcel, a);
            } else {
                str = C15467a.m32163n(parcel, a);
            }
        }
        C15467a.m32173x(parcel, b);
        return new MapStyleOptions(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MapStyleOptions[i];
    }
}
