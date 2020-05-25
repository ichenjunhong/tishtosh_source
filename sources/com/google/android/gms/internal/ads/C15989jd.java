package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.internal.ads.jd */
public final class C15989jd implements Creator<zzaks> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaks[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            if (C15467a.m32142a(a) != 1) {
                C15467a.m32149b(parcel, a);
            } else {
                i = C15467a.m32154e(parcel, a);
            }
        }
        C15467a.m32173x(parcel, b);
        return new zzaks(i);
    }
}
