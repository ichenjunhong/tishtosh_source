package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.zw */
public final class C16440zw implements Creator<zzbbq> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbbq[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        String str = null;
        String str2 = null;
        List list = null;
        List list2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 2:
                    str = C15467a.m32163n(parcel, a);
                    break;
                case 3:
                    str2 = C15467a.m32163n(parcel, a);
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
                    z3 = C15467a.m32152c(parcel, a);
                    break;
                case 8:
                    z4 = C15467a.m32152c(parcel, a);
                    break;
                case 9:
                    list2 = C15467a.m32170u(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        zzbbq zzbbq = new zzbbq(str, str2, z, z2, list, z3, z4, list2);
        return zzbbq;
    }
}
