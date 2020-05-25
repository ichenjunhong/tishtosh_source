package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.location.g */
public final class C16888g implements Creator<LocationAvailability> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        long j = 0;
        zzaj[] zzajArr = null;
        int i = 1000;
        int i2 = 1;
        int i3 = 1;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    i2 = C15467a.m32154e(parcel, a);
                    break;
                case 2:
                    i3 = C15467a.m32154e(parcel, a);
                    break;
                case 3:
                    j = C15467a.m32156g(parcel, a);
                    break;
                case 4:
                    i = C15467a.m32154e(parcel, a);
                    break;
                case 5:
                    zzajArr = (zzaj[]) C15467a.m32150b(parcel, a, zzaj.CREATOR);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        LocationAvailability locationAvailability = new LocationAvailability(i, i2, i3, j, zzajArr);
        return locationAvailability;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
