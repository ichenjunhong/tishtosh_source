package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.c */
public final class C15148c implements Creator<GoogleSignInOptionsExtensionParcelable> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptionsExtensionParcelable[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        int i = 0;
        Bundle bundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    i = C15467a.m32154e(parcel, a);
                    break;
                case 2:
                    i2 = C15467a.m32154e(parcel, a);
                    break;
                case 3:
                    bundle = C15467a.m32165p(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        return new GoogleSignInOptionsExtensionParcelable(i, i2, bundle);
    }
}
