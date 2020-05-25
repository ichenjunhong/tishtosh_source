package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

public final class afi implements Creator<zzbgz> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbgz[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 2:
                    str = C15467a.m32163n(parcel, a);
                    break;
                case 3:
                    i = C15467a.m32154e(parcel, a);
                    break;
                case 4:
                    i2 = C15467a.m32154e(parcel, a);
                    break;
                case 5:
                    z = C15467a.m32152c(parcel, a);
                    break;
                case 6:
                    z2 = C15467a.m32152c(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        zzbgz zzbgz = new zzbgz(str, i, i2, z, z2);
        return zzbgz;
    }
}
