package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.internal.measurement.cl */
public final class C16595cl implements Creator<zzdy> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdy[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C15467a.m32148b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    j = C15467a.m32156g(parcel2, a);
                    break;
                case 2:
                    j2 = C15467a.m32156g(parcel2, a);
                    break;
                case 3:
                    z = C15467a.m32152c(parcel2, a);
                    break;
                case 4:
                    str = C15467a.m32163n(parcel2, a);
                    break;
                case 5:
                    str2 = C15467a.m32163n(parcel2, a);
                    break;
                case 6:
                    str3 = C15467a.m32163n(parcel2, a);
                    break;
                case 7:
                    bundle = C15467a.m32165p(parcel2, a);
                    break;
                default:
                    C15467a.m32149b(parcel2, a);
                    break;
            }
        }
        C15467a.m32173x(parcel2, b);
        zzdy zzdy = new zzdy(j, j2, z, str, str2, str3, bundle);
        return zzdy;
    }
}
