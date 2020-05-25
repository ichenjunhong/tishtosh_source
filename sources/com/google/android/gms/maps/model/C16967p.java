package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.maps.model.p */
public final class C16967p implements Creator<PolygonOptions> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new PolygonOptions[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C15467a.m32148b(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        List list = null;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 2:
                    arrayList2 = C15467a.m32151c(parcel2, a, LatLng.CREATOR);
                    break;
                case 3:
                    ClassLoader classLoader = getClass().getClassLoader();
                    int a2 = C15467a.m32144a(parcel2, a);
                    int dataPosition = parcel.dataPosition();
                    if (a2 == 0) {
                        break;
                    } else {
                        parcel2.readList(arrayList, classLoader);
                        parcel2.setDataPosition(dataPosition + a2);
                        break;
                    }
                case 4:
                    f = C15467a.m32159j(parcel2, a);
                    break;
                case 5:
                    i = C15467a.m32154e(parcel2, a);
                    break;
                case 6:
                    i2 = C15467a.m32154e(parcel2, a);
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
                    i3 = C15467a.m32154e(parcel2, a);
                    break;
                case 12:
                    list = C15467a.m32151c(parcel2, a, PatternItem.CREATOR);
                    break;
                default:
                    C15467a.m32149b(parcel2, a);
                    break;
            }
        }
        C15467a.m32173x(parcel2, b);
        PolygonOptions polygonOptions = new PolygonOptions(arrayList2, arrayList, f, i, i2, f2, z, z2, z3, i3, list);
        return polygonOptions;
    }
}
