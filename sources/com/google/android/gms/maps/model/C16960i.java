package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.maps.model.i */
public final class C16960i implements Creator<GroundOverlayOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C15467a.m32148b(parcel);
        IBinder iBinder = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        boolean z = false;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 2:
                    iBinder = C15467a.m32164o(parcel2, a);
                    break;
                case 3:
                    latLng = (LatLng) C15467a.m32145a(parcel2, a, LatLng.CREATOR);
                    break;
                case 4:
                    f = C15467a.m32159j(parcel2, a);
                    break;
                case 5:
                    f2 = C15467a.m32159j(parcel2, a);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) C15467a.m32145a(parcel2, a, LatLngBounds.CREATOR);
                    break;
                case 7:
                    f3 = C15467a.m32159j(parcel2, a);
                    break;
                case 8:
                    f4 = C15467a.m32159j(parcel2, a);
                    break;
                case 9:
                    z = C15467a.m32152c(parcel2, a);
                    break;
                case 10:
                    f5 = C15467a.m32159j(parcel2, a);
                    break;
                case 11:
                    f6 = C15467a.m32159j(parcel2, a);
                    break;
                case 12:
                    f7 = C15467a.m32159j(parcel2, a);
                    break;
                case 13:
                    z2 = C15467a.m32152c(parcel2, a);
                    break;
                default:
                    C15467a.m32149b(parcel2, a);
                    break;
            }
        }
        C15467a.m32173x(parcel2, b);
        GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions(iBinder, latLng, f, f2, latLngBounds, f3, f4, z, f5, f6, f7, z2);
        return groundOverlayOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GroundOverlayOptions[i];
    }
}
