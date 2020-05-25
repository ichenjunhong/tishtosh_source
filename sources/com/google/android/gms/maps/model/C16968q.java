package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import java.util.List;

/* renamed from: com.google.android.gms.maps.model.q */
public final class C16968q implements Creator<PolylineOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C15467a.m32148b(parcel);
        List list = null;
        Cap cap = null;
        Cap cap2 = null;
        List list2 = null;
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 2:
                    list = C15467a.m32151c(parcel2, a, LatLng.CREATOR);
                    break;
                case 3:
                    f = C15467a.m32159j(parcel2, a);
                    break;
                case 4:
                    i = C15467a.m32154e(parcel2, a);
                    break;
                case 5:
                    f2 = C15467a.m32159j(parcel2, a);
                    break;
                case 6:
                    z = C15467a.m32152c(parcel2, a);
                    break;
                case 7:
                    z2 = C15467a.m32152c(parcel2, a);
                    break;
                case 8:
                    z3 = C15467a.m32152c(parcel2, a);
                    break;
                case 9:
                    cap = (Cap) C15467a.m32145a(parcel2, a, Cap.CREATOR);
                    break;
                case 10:
                    cap2 = (Cap) C15467a.m32145a(parcel2, a, Cap.CREATOR);
                    break;
                case 11:
                    i2 = C15467a.m32154e(parcel2, a);
                    break;
                case 12:
                    list2 = C15467a.m32151c(parcel2, a, PatternItem.CREATOR);
                    break;
                default:
                    C15467a.m32149b(parcel2, a);
                    break;
            }
        }
        C15467a.m32173x(parcel2, b);
        PolylineOptions polylineOptions = new PolylineOptions(list, f, i, f2, z, z2, z3, cap, cap2, i2, list2);
        return polylineOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PolylineOptions[i];
    }
}
