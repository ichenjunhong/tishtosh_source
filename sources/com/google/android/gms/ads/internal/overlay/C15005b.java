package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.ads.internal.overlay.b */
public final class C15005b implements Creator<zzc> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzc[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 2:
                    str = C15467a.m32163n(parcel, a);
                    break;
                case 3:
                    str2 = C15467a.m32163n(parcel, a);
                    break;
                case 4:
                    str3 = C15467a.m32163n(parcel, a);
                    break;
                case 5:
                    str4 = C15467a.m32163n(parcel, a);
                    break;
                case 6:
                    str5 = C15467a.m32163n(parcel, a);
                    break;
                case 7:
                    str6 = C15467a.m32163n(parcel, a);
                    break;
                case 8:
                    str7 = C15467a.m32163n(parcel, a);
                    break;
                case 9:
                    intent = (Intent) C15467a.m32145a(parcel, a, Intent.CREATOR);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        zzc zzc = new zzc(str, str2, str3, str4, str5, str6, str7, intent);
        return zzc;
    }
}
