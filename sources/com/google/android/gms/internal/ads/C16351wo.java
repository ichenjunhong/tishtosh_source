package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.internal.ads.wo */
public final class C16351wo implements Creator<zzayi> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzayi[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            if (C15467a.m32142a(a) != 2) {
                C15467a.m32149b(parcel, a);
            } else {
                str = C15467a.m32163n(parcel, a);
            }
        }
        C15467a.m32173x(parcel, b);
        return new zzayi(str);
    }
}