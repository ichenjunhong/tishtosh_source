package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.maps.model.t */
public final class C16971t implements Creator<StreetViewPanoramaLocation> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        StreetViewPanoramaLink[] streetViewPanoramaLinkArr = null;
        LatLng latLng = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 2:
                    streetViewPanoramaLinkArr = (StreetViewPanoramaLink[]) C15467a.m32150b(parcel, a, StreetViewPanoramaLink.CREATOR);
                    break;
                case 3:
                    latLng = (LatLng) C15467a.m32145a(parcel, a, LatLng.CREATOR);
                    break;
                case 4:
                    str = C15467a.m32163n(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        return new StreetViewPanoramaLocation(streetViewPanoramaLinkArr, latLng, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaLocation[i];
    }
}
