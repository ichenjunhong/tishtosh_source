package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import java.util.List;

/* renamed from: com.google.android.gms.auth.d */
public final class C15171d implements Creator<TokenData> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        String str = null;
        Long l = null;
        List list = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    i = C15467a.m32154e(parcel, a);
                    break;
                case 2:
                    str = C15467a.m32163n(parcel, a);
                    break;
                case 3:
                    l = C15467a.m32157h(parcel, a);
                    break;
                case 4:
                    z = C15467a.m32152c(parcel, a);
                    break;
                case 5:
                    z2 = C15467a.m32152c(parcel, a);
                    break;
                case 6:
                    list = C15467a.m32170u(parcel, a);
                    break;
                case 7:
                    str2 = C15467a.m32163n(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        TokenData tokenData = new TokenData(i, str, l, z, z2, list, str2);
        return tokenData;
    }
}
