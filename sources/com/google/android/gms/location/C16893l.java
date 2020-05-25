package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.l */
public final class C16893l implements Creator<LocationSettingsRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        boolean z = false;
        ArrayList arrayList = null;
        zzae zzae = null;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            int a2 = C15467a.m32142a(a);
            if (a2 != 5) {
                switch (a2) {
                    case 1:
                        arrayList = C15467a.m32151c(parcel, a, LocationRequest.CREATOR);
                        break;
                    case 2:
                        z = C15467a.m32152c(parcel, a);
                        break;
                    case 3:
                        z2 = C15467a.m32152c(parcel, a);
                        break;
                    default:
                        C15467a.m32149b(parcel, a);
                        break;
                }
            } else {
                zzae = (zzae) C15467a.m32145a(parcel, a, zzae.CREATOR);
            }
        }
        C15467a.m32173x(parcel, b);
        return new LocationSettingsRequest(arrayList, z, z2, zzae);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsRequest[i];
    }
}
