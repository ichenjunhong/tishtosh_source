package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.common.internal.ad */
public final class C15413ad implements Creator<zzb> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzb[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        Bundle bundle = null;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    bundle = C15467a.m32165p(parcel, a);
                    break;
                case 2:
                    featureArr = (Feature[]) C15467a.m32150b(parcel, a, Feature.CREATOR);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        return new zzb(bundle, featureArr);
    }
}
