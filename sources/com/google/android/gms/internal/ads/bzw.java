package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

public final class bzw implements Creator<zzyz> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzyz[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        String str = null;
        zzyz[] zzyzArr = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
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
                    i = C15467a.m32154e(parcel, a);
                    break;
                case 4:
                    i2 = C15467a.m32154e(parcel, a);
                    break;
                case 5:
                    z = C15467a.m32152c(parcel, a);
                    break;
                case 6:
                    i3 = C15467a.m32154e(parcel, a);
                    break;
                case 7:
                    i4 = C15467a.m32154e(parcel, a);
                    break;
                case 8:
                    zzyzArr = (zzyz[]) C15467a.m32150b(parcel, a, zzyz.CREATOR);
                    break;
                case 9:
                    z2 = C15467a.m32152c(parcel, a);
                    break;
                case 10:
                    z3 = C15467a.m32152c(parcel, a);
                    break;
                case 11:
                    z4 = C15467a.m32152c(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        zzyz zzyz = new zzyz(str, i, i2, z, i3, i4, zzyzArr, z2, z3, z4);
        return zzyz;
    }
}
