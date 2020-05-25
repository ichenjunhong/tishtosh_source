package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.internal.ads.yn */
public final class C16404yn implements Creator<zzbad> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbad[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        zzyv zzyv = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 2:
                    zzyv = (zzyv) C15467a.m32145a(parcel, a, zzyv.CREATOR);
                    break;
                case 3:
                    str = C15467a.m32163n(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        return new zzbad(zzyv, str);
    }
}
