package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.auth.a */
public final class C15105a implements Creator<AccountChangeEvent> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountChangeEvent[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    i = C15467a.m32154e(parcel, a);
                    break;
                case 2:
                    j = C15467a.m32156g(parcel, a);
                    break;
                case 3:
                    str = C15467a.m32163n(parcel, a);
                    break;
                case 4:
                    i2 = C15467a.m32154e(parcel, a);
                    break;
                case 5:
                    i3 = C15467a.m32154e(parcel, a);
                    break;
                case 6:
                    str2 = C15467a.m32163n(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        AccountChangeEvent accountChangeEvent = new AccountChangeEvent(i, j, str, i2, i3, str2);
        return accountChangeEvent;
    }
}
