package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: com.google.android.gms.maps.g */
public final class C16943g implements Creator<GoogleMapOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C15467a.m32148b(parcel);
        CameraPosition cameraPosition = null;
        Float f = null;
        Float f2 = null;
        LatLngBounds latLngBounds = null;
        byte b2 = -1;
        byte b3 = -1;
        int i = 0;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 2:
                    b2 = C15467a.m32153d(parcel2, a);
                    break;
                case 3:
                    b3 = C15467a.m32153d(parcel2, a);
                    break;
                case 4:
                    i = C15467a.m32154e(parcel2, a);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) C15467a.m32145a(parcel2, a, CameraPosition.CREATOR);
                    break;
                case 6:
                    b4 = C15467a.m32153d(parcel2, a);
                    break;
                case 7:
                    b5 = C15467a.m32153d(parcel2, a);
                    break;
                case 8:
                    b6 = C15467a.m32153d(parcel2, a);
                    break;
                case 9:
                    b7 = C15467a.m32153d(parcel2, a);
                    break;
                case 10:
                    b8 = C15467a.m32153d(parcel2, a);
                    break;
                case 11:
                    b9 = C15467a.m32153d(parcel2, a);
                    break;
                case 12:
                    b10 = C15467a.m32153d(parcel2, a);
                    break;
                case 14:
                    b11 = C15467a.m32153d(parcel2, a);
                    break;
                case 15:
                    b12 = C15467a.m32153d(parcel2, a);
                    break;
                case 16:
                    f = C15467a.m32160k(parcel2, a);
                    break;
                case 17:
                    f2 = C15467a.m32160k(parcel2, a);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) C15467a.m32145a(parcel2, a, LatLngBounds.CREATOR);
                    break;
                default:
                    C15467a.m32149b(parcel2, a);
                    break;
            }
        }
        C15467a.m32173x(parcel2, b);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions(b2, b3, i, cameraPosition, b4, b5, b6, b7, b8, b9, b10, b11, b12, f, f2, latLngBounds);
        return googleMapOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
