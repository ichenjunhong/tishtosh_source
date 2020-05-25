package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.ads.internal.s */
public final class C15032s implements Creator<zzar> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzar[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f = 0.0f;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 2:
                    z = C15467a.m32152c(parcel, a);
                    break;
                case 3:
                    z2 = C15467a.m32152c(parcel, a);
                    break;
                case 4:
                    str = C15467a.m32163n(parcel, a);
                    break;
                case 5:
                    z3 = C15467a.m32152c(parcel, a);
                    break;
                case 6:
                    f = C15467a.m32159j(parcel, a);
                    break;
                case 7:
                    i = C15467a.m32154e(parcel, a);
                    break;
                case 8:
                    z4 = C15467a.m32152c(parcel, a);
                    break;
                case 9:
                    z5 = C15467a.m32152c(parcel, a);
                    break;
                case 10:
                    z6 = C15467a.m32152c(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        zzar zzar = new zzar(z, z2, str, z3, f, i, z4, z5, z6);
        return zzar;
    }
}
