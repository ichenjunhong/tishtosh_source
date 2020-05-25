package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.internal.ads.il */
public final class C15970il implements Creator<zzajw> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzajw[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C15467a.m32148b(parcel);
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j = 0;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    z = C15467a.m32152c(parcel2, a);
                    break;
                case 2:
                    str = C15467a.m32163n(parcel2, a);
                    break;
                case 3:
                    i = C15467a.m32154e(parcel2, a);
                    break;
                case 4:
                    bArr = C15467a.m32166q(parcel2, a);
                    break;
                case 5:
                    strArr = C15467a.m32169t(parcel2, a);
                    break;
                case 6:
                    strArr2 = C15467a.m32169t(parcel2, a);
                    break;
                case 7:
                    z2 = C15467a.m32152c(parcel2, a);
                    break;
                case 8:
                    j = C15467a.m32156g(parcel2, a);
                    break;
                default:
                    C15467a.m32149b(parcel2, a);
                    break;
            }
        }
        C15467a.m32173x(parcel2, b);
        zzajw zzajw = new zzajw(z, str, i, bArr, strArr, strArr2, z2, j);
        return zzajw;
    }
}
