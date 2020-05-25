package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

public final class bxo implements Creator<zzwr> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzwr[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C15467a.m32148b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 2:
                    str = C15467a.m32163n(parcel2, a);
                    break;
                case 3:
                    j = C15467a.m32156g(parcel2, a);
                    break;
                case 4:
                    str2 = C15467a.m32163n(parcel2, a);
                    break;
                case 5:
                    str3 = C15467a.m32163n(parcel2, a);
                    break;
                case 6:
                    str4 = C15467a.m32163n(parcel2, a);
                    break;
                case 7:
                    bundle = C15467a.m32165p(parcel2, a);
                    break;
                case 8:
                    z = C15467a.m32152c(parcel2, a);
                    break;
                case 9:
                    j2 = C15467a.m32156g(parcel2, a);
                    break;
                default:
                    C15467a.m32149b(parcel2, a);
                    break;
            }
        }
        C15467a.m32173x(parcel2, b);
        zzwr zzwr = new zzwr(str, j, str2, str3, str4, bundle, z, j2);
        return zzwr;
    }
}
