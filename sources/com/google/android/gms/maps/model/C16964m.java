package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.maps.model.m */
public final class C16964m implements Creator<MarkerOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C15467a.m32148b(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 1.0f;
        float f7 = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 2:
                    latLng = (LatLng) C15467a.m32145a(parcel2, a, LatLng.CREATOR);
                    break;
                case 3:
                    str = C15467a.m32163n(parcel2, a);
                    break;
                case 4:
                    str2 = C15467a.m32163n(parcel2, a);
                    break;
                case 5:
                    iBinder = C15467a.m32164o(parcel2, a);
                    break;
                case 6:
                    f = C15467a.m32159j(parcel2, a);
                    break;
                case 7:
                    f2 = C15467a.m32159j(parcel2, a);
                    break;
                case 8:
                    z = C15467a.m32152c(parcel2, a);
                    break;
                case 9:
                    z2 = C15467a.m32152c(parcel2, a);
                    break;
                case 10:
                    z3 = C15467a.m32152c(parcel2, a);
                    break;
                case 11:
                    f3 = C15467a.m32159j(parcel2, a);
                    break;
                case 12:
                    f4 = C15467a.m32159j(parcel2, a);
                    break;
                case 13:
                    f5 = C15467a.m32159j(parcel2, a);
                    break;
                case 14:
                    f6 = C15467a.m32159j(parcel2, a);
                    break;
                case 15:
                    f7 = C15467a.m32159j(parcel2, a);
                    break;
                default:
                    C15467a.m32149b(parcel2, a);
                    break;
            }
        }
        C15467a.m32173x(parcel2, b);
        MarkerOptions markerOptions = new MarkerOptions(latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f4, f5, f6, f7);
        return markerOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MarkerOptions[i];
    }
}
