package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.measurement.internal.eq */
public final class C17106eq implements Creator<zzk> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzk[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C15467a.m32148b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        long j5 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 2:
                    str = C15467a.m32163n(parcel2, a);
                    break;
                case 3:
                    str2 = C15467a.m32163n(parcel2, a);
                    break;
                case 4:
                    str3 = C15467a.m32163n(parcel2, a);
                    break;
                case 5:
                    str4 = C15467a.m32163n(parcel2, a);
                    break;
                case 6:
                    j = C15467a.m32156g(parcel2, a);
                    break;
                case 7:
                    j2 = C15467a.m32156g(parcel2, a);
                    break;
                case 8:
                    str5 = C15467a.m32163n(parcel2, a);
                    break;
                case 9:
                    z = C15467a.m32152c(parcel2, a);
                    break;
                case 10:
                    z2 = C15467a.m32152c(parcel2, a);
                    break;
                case 11:
                    j5 = C15467a.m32156g(parcel2, a);
                    break;
                case 12:
                    str6 = C15467a.m32163n(parcel2, a);
                    break;
                case 13:
                    j3 = C15467a.m32156g(parcel2, a);
                    break;
                case 14:
                    j4 = C15467a.m32156g(parcel2, a);
                    break;
                case 15:
                    i = C15467a.m32154e(parcel2, a);
                    break;
                case 16:
                    z3 = C15467a.m32152c(parcel2, a);
                    break;
                case 17:
                    z4 = C15467a.m32152c(parcel2, a);
                    break;
                case 18:
                    z5 = C15467a.m32152c(parcel2, a);
                    break;
                case 19:
                    str7 = C15467a.m32163n(parcel2, a);
                    break;
                default:
                    C15467a.m32149b(parcel2, a);
                    break;
            }
        }
        C15467a.m32173x(parcel2, b);
        zzk zzk = new zzk(str, str2, str3, str4, j, j2, str5, z, z2, j5, str6, j3, j4, i, z3, z4, z5, str7);
        return zzk;
    }
}
