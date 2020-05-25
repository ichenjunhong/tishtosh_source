package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;

/* renamed from: com.google.android.gms.common.server.response.a */
public final class C15492a implements Creator<Field> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new Field[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        String str = null;
        String str2 = null;
        zaa zaa = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    i = C15467a.m32154e(parcel, a);
                    break;
                case 2:
                    i2 = C15467a.m32154e(parcel, a);
                    break;
                case 3:
                    z = C15467a.m32152c(parcel, a);
                    break;
                case 4:
                    i3 = C15467a.m32154e(parcel, a);
                    break;
                case 5:
                    z2 = C15467a.m32152c(parcel, a);
                    break;
                case 6:
                    str = C15467a.m32163n(parcel, a);
                    break;
                case 7:
                    i4 = C15467a.m32154e(parcel, a);
                    break;
                case 8:
                    str2 = C15467a.m32163n(parcel, a);
                    break;
                case 9:
                    zaa = (zaa) C15467a.m32145a(parcel, a, zaa.CREATOR);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        Field field = new Field(i, i2, z, i3, z2, str, i4, str2, zaa);
        return field;
    }
}
