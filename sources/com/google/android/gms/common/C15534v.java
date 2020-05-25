package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.common.v */
public final class C15534v implements Creator<zzk> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzk[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    str = C15467a.m32163n(parcel, a);
                    break;
                case 2:
                    iBinder = C15467a.m32164o(parcel, a);
                    break;
                case 3:
                    z = C15467a.m32152c(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        return new zzk(str, iBinder, z);
    }
}
