package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import java.util.List;

/* renamed from: com.google.android.gms.location.i */
public final class C16890i implements Creator<LocationResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        List<Location> list = LocationResult.f47635a;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            if (C15467a.m32142a(a) != 1) {
                C15467a.m32149b(parcel, a);
            } else {
                list = C15467a.m32151c(parcel, a, Location.CREATOR);
            }
        }
        C15467a.m32173x(parcel, b);
        return new LocationResult(list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationResult[i];
    }
}
