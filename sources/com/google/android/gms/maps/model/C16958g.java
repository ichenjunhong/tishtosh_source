package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.maps.model.g */
public final class C16958g implements Creator<Cap> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        IBinder iBinder = null;
        int i = 0;
        Float f = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 2:
                    i = C15467a.m32154e(parcel, a);
                    break;
                case 3:
                    iBinder = C15467a.m32164o(parcel, a);
                    break;
                case 4:
                    f = C15467a.m32160k(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        return new Cap(i, iBinder, f);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Cap[i];
    }
}
