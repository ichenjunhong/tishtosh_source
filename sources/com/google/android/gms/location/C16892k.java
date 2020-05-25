package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.location.k */
public final class C16892k implements Creator<zzae> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        String str = "";
        String str2 = "";
        String str3 = "";
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            int a2 = C15467a.m32142a(a);
            if (a2 != 5) {
                switch (a2) {
                    case 1:
                        str2 = C15467a.m32163n(parcel, a);
                        break;
                    case 2:
                        str3 = C15467a.m32163n(parcel, a);
                        break;
                    default:
                        C15467a.m32149b(parcel, a);
                        break;
                }
            } else {
                str = C15467a.m32163n(parcel, a);
            }
        }
        C15467a.m32173x(parcel, b);
        return new zzae(str, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzae[i];
    }
}
