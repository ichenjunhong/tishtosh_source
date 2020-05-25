package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.vs */
public final class C16328vs implements Creator<zzaxk> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaxk[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        boolean z = false;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 2:
                    z = C15467a.m32152c(parcel, a);
                    break;
                case 3:
                    arrayList = C15467a.m32170u(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        return new zzaxk(z, arrayList);
    }
}
