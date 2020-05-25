package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import com.google.android.gms.common.server.converter.StringToIntConverter.zaa;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.server.converter.b */
public final class C15489b implements Creator<StringToIntConverter> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new StringToIntConverter[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    i = C15467a.m32154e(parcel, a);
                    break;
                case 2:
                    arrayList = C15467a.m32151c(parcel, a, zaa.CREATOR);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        return new StringToIntConverter(i, arrayList);
    }
}
