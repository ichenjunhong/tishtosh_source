package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.internal.ads.ed */
public final class C15854ed implements Creator<zzafl> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzafl[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        zzacq zzacq = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    i = C15467a.m32154e(parcel, a);
                    break;
                case 2:
                    z = C15467a.m32152c(parcel, a);
                    break;
                case 3:
                    i2 = C15467a.m32154e(parcel, a);
                    break;
                case 4:
                    z2 = C15467a.m32152c(parcel, a);
                    break;
                case 5:
                    i3 = C15467a.m32154e(parcel, a);
                    break;
                case 6:
                    zzacq = (zzacq) C15467a.m32145a(parcel, a, zzacq.CREATOR);
                    break;
                case 7:
                    z3 = C15467a.m32152c(parcel, a);
                    break;
                case 8:
                    i4 = C15467a.m32154e(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        zzafl zzafl = new zzafl(i, z, i2, z2, i3, zzacq, z3, i4);
        return zzafl;
    }
}
