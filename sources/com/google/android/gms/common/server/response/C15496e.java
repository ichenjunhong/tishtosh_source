package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.common.server.response.e */
public final class C15496e implements Creator<SafeParcelResponse> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new SafeParcelResponse[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        Parcel parcel2 = null;
        int i = 0;
        zak zak = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    i = C15467a.m32154e(parcel, a);
                    break;
                case 2:
                    parcel2 = C15467a.m32171v(parcel, a);
                    break;
                case 3:
                    zak = (zak) C15467a.m32145a(parcel, a, zak.CREATOR);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        return new SafeParcelResponse(i, parcel2, zak);
    }
}
