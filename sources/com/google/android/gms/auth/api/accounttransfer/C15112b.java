package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.b */
public final class C15112b implements Creator<zzo> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    i = C15467a.m32154e(parcel, a);
                    break;
                case 2:
                    list = C15467a.m32170u(parcel, a);
                    break;
                case 3:
                    list2 = C15467a.m32170u(parcel, a);
                    break;
                case 4:
                    list3 = C15467a.m32170u(parcel, a);
                    break;
                case 5:
                    list4 = C15467a.m32170u(parcel, a);
                    break;
                case 6:
                    list5 = C15467a.m32170u(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        zzo zzo = new zzo(i, list, list2, list3, list4, list5);
        return zzo;
    }
}
