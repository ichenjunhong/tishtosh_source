package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.common.server.converter.a */
public final class C15488a implements Creator<zaa> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zaa[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        int i = 0;
        StringToIntConverter stringToIntConverter = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    i = C15467a.m32154e(parcel, a);
                    break;
                case 2:
                    stringToIntConverter = (StringToIntConverter) C15467a.m32145a(parcel, a, StringToIntConverter.CREATOR);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        return new zaa(i, stringToIntConverter);
    }
}
