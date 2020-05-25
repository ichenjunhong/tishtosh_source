package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.maps.model.w */
public final class C16974w implements Creator<Tile> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        int i = 0;
        byte[] bArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 2:
                    i = C15467a.m32154e(parcel, a);
                    break;
                case 3:
                    i2 = C15467a.m32154e(parcel, a);
                    break;
                case 4:
                    bArr = C15467a.m32166q(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        return new Tile(i, i2, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Tile[i];
    }
}
