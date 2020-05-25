package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.internal.ads.ik */
public final class C15969ik implements Creator<zzaju> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaju[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    str = C15467a.m32163n(parcel, a);
                    break;
                case 2:
                    strArr = C15467a.m32169t(parcel, a);
                    break;
                case 3:
                    strArr2 = C15467a.m32169t(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        return new zzaju(str, strArr, strArr2);
    }
}
