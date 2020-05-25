package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.location.o */
public final class C16896o implements Creator<zzaj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        long j = -1;
        long j2 = -1;
        int i = 1;
        int i2 = 1;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    i = C15467a.m32154e(parcel, a);
                    break;
                case 2:
                    i2 = C15467a.m32154e(parcel, a);
                    break;
                case 3:
                    j = C15467a.m32156g(parcel, a);
                    break;
                case 4:
                    j2 = C15467a.m32156g(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        zzaj zzaj = new zzaj(i, i2, j, j2);
        return zzaj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaj[i];
    }
}
