package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.measurement.internal.g */
public final class C17121g implements Creator<zzag> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzag[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        String str = null;
        zzad zzad = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 2:
                    str = C15467a.m32163n(parcel, a);
                    break;
                case 3:
                    zzad = (zzad) C15467a.m32145a(parcel, a, zzad.CREATOR);
                    break;
                case 4:
                    str2 = C15467a.m32163n(parcel, a);
                    break;
                case 5:
                    j = C15467a.m32156g(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        zzag zzag = new zzag(str, zzad, str2, j);
        return zzag;
    }
}
