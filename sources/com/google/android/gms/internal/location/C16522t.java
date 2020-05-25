package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.internal.location.t */
public final class C16522t implements Creator<zzbh> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbh[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C15467a.m32148b(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        String str = null;
        long j = 0;
        int i = 0;
        short s = 0;
        float f = 0.0f;
        int i2 = 0;
        int i3 = -1;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    str = C15467a.m32163n(parcel2, a);
                    break;
                case 2:
                    j = C15467a.m32156g(parcel2, a);
                    break;
                case 3:
                    C15467a.m32146a(parcel2, a, 4);
                    s = (short) parcel.readInt();
                    break;
                case 4:
                    d = C15467a.m32161l(parcel2, a);
                    break;
                case 5:
                    d2 = C15467a.m32161l(parcel2, a);
                    break;
                case 6:
                    f = C15467a.m32159j(parcel2, a);
                    break;
                case 7:
                    i = C15467a.m32154e(parcel2, a);
                    break;
                case 8:
                    i2 = C15467a.m32154e(parcel2, a);
                    break;
                case 9:
                    i3 = C15467a.m32154e(parcel2, a);
                    break;
                default:
                    C15467a.m32149b(parcel2, a);
                    break;
            }
        }
        C15467a.m32173x(parcel2, b);
        zzbh zzbh = new zzbh(str, i, s, d, d2, f, j, i2, i3);
        return zzbh;
    }
}
