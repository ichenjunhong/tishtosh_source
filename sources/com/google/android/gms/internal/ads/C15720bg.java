package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.internal.ads.bg */
public final class C15720bg implements Creator<zzacq> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzacq[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
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
                    z3 = C15467a.m32152c(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        return new zzacq(z, z2, z3);
    }
}
