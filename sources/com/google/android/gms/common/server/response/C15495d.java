package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.server.response.d */
public final class C15495d implements Creator<zal> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zal[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        String str = null;
        int i = 0;
        ArrayList arrayList = null;
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
                    arrayList = C15467a.m32151c(parcel, a, zam.CREATOR);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        return new zal(i, str, arrayList);
    }
}
