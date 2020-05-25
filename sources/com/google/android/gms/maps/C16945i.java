package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

/* renamed from: com.google.android.gms.maps.i */
public final class C16945i implements Creator<StreetViewPanoramaOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        String str = null;
        LatLng latLng = null;
        Integer num = null;
        StreetViewSource streetViewSource = null;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) C15467a.m32145a(parcel, a, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    str = C15467a.m32163n(parcel, a);
                    break;
                case 4:
                    latLng = (LatLng) C15467a.m32145a(parcel, a, LatLng.CREATOR);
                    break;
                case 5:
                    num = C15467a.m32155f(parcel, a);
                    break;
                case 6:
                    b2 = C15467a.m32153d(parcel, a);
                    break;
                case 7:
                    b3 = C15467a.m32153d(parcel, a);
                    break;
                case 8:
                    b4 = C15467a.m32153d(parcel, a);
                    break;
                case 9:
                    b5 = C15467a.m32153d(parcel, a);
                    break;
                case 10:
                    b6 = C15467a.m32153d(parcel, a);
                    break;
                case 11:
                    streetViewSource = (StreetViewSource) C15467a.m32145a(parcel, a, StreetViewSource.CREATOR);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        StreetViewPanoramaOptions streetViewPanoramaOptions = new StreetViewPanoramaOptions(streetViewPanoramaCamera, str, latLng, num, b2, b3, b4, b5, b6, streetViewSource);
        return streetViewPanoramaOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaOptions[i];
    }
}
