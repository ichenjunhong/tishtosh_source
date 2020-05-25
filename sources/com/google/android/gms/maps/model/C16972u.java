package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.maps.model.u */
public final class C16972u implements Creator<StreetViewPanoramaOrientation> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 2:
                    f = C15467a.m32159j(parcel, a);
                    break;
                case 3:
                    f2 = C15467a.m32159j(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        return new StreetViewPanoramaOrientation(f, f2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaOrientation[i];
    }
}
