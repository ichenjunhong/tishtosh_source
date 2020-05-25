package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.maps.model.z */
public final class C16977z implements Creator<VisibleRegion> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 2:
                    latLng = (LatLng) C15467a.m32145a(parcel, a, LatLng.CREATOR);
                    break;
                case 3:
                    latLng2 = (LatLng) C15467a.m32145a(parcel, a, LatLng.CREATOR);
                    break;
                case 4:
                    latLng3 = (LatLng) C15467a.m32145a(parcel, a, LatLng.CREATOR);
                    break;
                case 5:
                    latLng4 = (LatLng) C15467a.m32145a(parcel, a, LatLng.CREATOR);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) C15467a.m32145a(parcel, a, LatLngBounds.CREATOR);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        VisibleRegion visibleRegion = new VisibleRegion(latLng, latLng2, latLng3, latLng4, latLngBounds);
        return visibleRegion;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new VisibleRegion[i];
    }
}
