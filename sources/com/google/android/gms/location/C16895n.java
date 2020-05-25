package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.location.n */
public final class C16895n implements Creator<LocationSettingsStates> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    z = C15467a.m32152c(parcel, a);
                    break;
                case 2:
                    z2 = C15467a.m32152c(parcel, a);
                    break;
                case 3:
                    z3 = C15467a.m32152c(parcel, a);
                    break;
                case 4:
                    z4 = C15467a.m32152c(parcel, a);
                    break;
                case 5:
                    z5 = C15467a.m32152c(parcel, a);
                    break;
                case 6:
                    z6 = C15467a.m32152c(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        LocationSettingsStates locationSettingsStates = new LocationSettingsStates(z, z2, z3, z4, z5, z6);
        return locationSettingsStates;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsStates[i];
    }
}
