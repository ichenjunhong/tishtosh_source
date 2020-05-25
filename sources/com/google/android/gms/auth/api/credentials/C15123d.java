package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.auth.api.credentials.d */
public final class C15123d implements Creator<CredentialPickerConfig> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new CredentialPickerConfig[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            int a2 = C15467a.m32142a(a);
            if (a2 != 1000) {
                switch (a2) {
                    case 1:
                        z = C15467a.m32152c(parcel, a);
                        break;
                    case 2:
                        z2 = C15467a.m32152c(parcel, a);
                        break;
                    case 3:
                        z3 = C15467a.m32152c(parcel, a);
                        break;
                    case 4:
                        i2 = C15467a.m32154e(parcel, a);
                        break;
                    default:
                        C15467a.m32149b(parcel, a);
                        break;
                }
            } else {
                i = C15467a.m32154e(parcel, a);
            }
        }
        C15467a.m32173x(parcel, b);
        CredentialPickerConfig credentialPickerConfig = new CredentialPickerConfig(i, z, z2, z3, i2);
        return credentialPickerConfig;
    }
}
