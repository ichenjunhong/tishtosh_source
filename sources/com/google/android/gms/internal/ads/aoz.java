package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

public final class aoz implements Creator<zzbql> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbql[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    i = C15467a.m32154e(parcel, a);
                    break;
                case 2:
                    bArr = C15467a.m32166q(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        return new zzbql(i, bArr);
    }
}
