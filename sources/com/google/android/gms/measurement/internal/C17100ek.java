package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.measurement.internal.ek */
public final class C17100ek implements Creator<zzfv> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfv[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C15467a.m32148b(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    i = C15467a.m32154e(parcel2, a);
                    break;
                case 2:
                    str = C15467a.m32163n(parcel2, a);
                    break;
                case 3:
                    j = C15467a.m32156g(parcel2, a);
                    break;
                case 4:
                    l = C15467a.m32157h(parcel2, a);
                    break;
                case 5:
                    f = C15467a.m32160k(parcel2, a);
                    break;
                case 6:
                    str2 = C15467a.m32163n(parcel2, a);
                    break;
                case 7:
                    str3 = C15467a.m32163n(parcel2, a);
                    break;
                case 8:
                    int a2 = C15467a.m32144a(parcel2, a);
                    if (a2 != 0) {
                        C15467a.m32147a(parcel2, a, a2, 8);
                        d = Double.valueOf(parcel.readDouble());
                        break;
                    } else {
                        d = null;
                        break;
                    }
                default:
                    C15467a.m32149b(parcel2, a);
                    break;
            }
        }
        C15467a.m32173x(parcel2, b);
        zzfv zzfv = new zzfv(i, str, j, l, f, str2, str3, d);
        return zzfv;
    }
}
