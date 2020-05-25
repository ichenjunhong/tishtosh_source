package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import com.google.android.gms.internal.location.zzbh;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.ac */
public final class C16872ac implements Creator<GeofencingRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        String str = "";
        ArrayList arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    arrayList = C15467a.m32151c(parcel, a, zzbh.CREATOR);
                    break;
                case 2:
                    i = C15467a.m32154e(parcel, a);
                    break;
                case 3:
                    str = C15467a.m32163n(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        return new GeofencingRequest(arrayList, i, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GeofencingRequest[i];
    }
}
