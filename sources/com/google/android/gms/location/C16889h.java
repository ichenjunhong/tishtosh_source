package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.location.h */
public final class C16889h implements Creator<LocationRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C15467a.m32148b(parcel);
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        int i = 102;
        boolean z = false;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    i = C15467a.m32154e(parcel2, a);
                    break;
                case 2:
                    j = C15467a.m32156g(parcel2, a);
                    break;
                case 3:
                    j2 = C15467a.m32156g(parcel2, a);
                    break;
                case 4:
                    z = C15467a.m32152c(parcel2, a);
                    break;
                case 5:
                    j3 = C15467a.m32156g(parcel2, a);
                    break;
                case 6:
                    i2 = C15467a.m32154e(parcel2, a);
                    break;
                case 7:
                    f = C15467a.m32159j(parcel2, a);
                    break;
                case 8:
                    j4 = C15467a.m32156g(parcel2, a);
                    break;
                default:
                    C15467a.m32149b(parcel2, a);
                    break;
            }
        }
        C15467a.m32173x(parcel2, b);
        LocationRequest locationRequest = new LocationRequest(i, j, j2, z, j3, i2, f, j4);
        return locationRequest;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
