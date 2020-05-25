package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.internal.location.aa */
public final class C16502aa implements Creator<zzo> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        zzm zzm = null;
        int i = 1;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    i = C15467a.m32154e(parcel, a);
                    break;
                case 2:
                    zzm = (zzm) C15467a.m32145a(parcel, a, zzm.CREATOR);
                    break;
                case 3:
                    iBinder = C15467a.m32164o(parcel, a);
                    break;
                case 4:
                    iBinder2 = C15467a.m32164o(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        return new zzo(i, zzm, iBinder, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
