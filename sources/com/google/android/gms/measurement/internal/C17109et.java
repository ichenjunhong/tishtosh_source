package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.measurement.internal.et */
public final class C17109et implements Creator<zzo> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C15467a.m32148b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        zzfv zzfv = null;
        String str3 = null;
        zzag zzag = null;
        zzag zzag2 = null;
        zzag zzag3 = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 2:
                    str = C15467a.m32163n(parcel2, a);
                    break;
                case 3:
                    str2 = C15467a.m32163n(parcel2, a);
                    break;
                case 4:
                    zzfv = (zzfv) C15467a.m32145a(parcel2, a, zzfv.CREATOR);
                    break;
                case 5:
                    j = C15467a.m32156g(parcel2, a);
                    break;
                case 6:
                    z = C15467a.m32152c(parcel2, a);
                    break;
                case 7:
                    str3 = C15467a.m32163n(parcel2, a);
                    break;
                case 8:
                    zzag = (zzag) C15467a.m32145a(parcel2, a, zzag.CREATOR);
                    break;
                case 9:
                    j2 = C15467a.m32156g(parcel2, a);
                    break;
                case 10:
                    zzag2 = (zzag) C15467a.m32145a(parcel2, a, zzag.CREATOR);
                    break;
                case 11:
                    j3 = C15467a.m32156g(parcel2, a);
                    break;
                case 12:
                    zzag3 = (zzag) C15467a.m32145a(parcel2, a, zzag.CREATOR);
                    break;
                default:
                    C15467a.m32149b(parcel2, a);
                    break;
            }
        }
        C15467a.m32173x(parcel2, b);
        zzo zzo = new zzo(str, str2, zzfv, j, z, str3, zzag, j2, zzag2, j3, zzag3);
        return zzo;
    }
}
