package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.auth.api.credentials.g */
public final class C15126g implements Creator<HintRequest> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new HintRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        CredentialPickerConfig credentialPickerConfig = null;
        String[] strArr = null;
        String str = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            int a2 = C15467a.m32142a(a);
            if (a2 != 1000) {
                switch (a2) {
                    case 1:
                        credentialPickerConfig = (CredentialPickerConfig) C15467a.m32145a(parcel, a, CredentialPickerConfig.CREATOR);
                        break;
                    case 2:
                        z = C15467a.m32152c(parcel, a);
                        break;
                    case 3:
                        z2 = C15467a.m32152c(parcel, a);
                        break;
                    case 4:
                        strArr = C15467a.m32169t(parcel, a);
                        break;
                    case 5:
                        z3 = C15467a.m32152c(parcel, a);
                        break;
                    case 6:
                        str = C15467a.m32163n(parcel, a);
                        break;
                    case 7:
                        str2 = C15467a.m32163n(parcel, a);
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
        HintRequest hintRequest = new HintRequest(i, credentialPickerConfig, z, z2, strArr, z3, str, str2);
        return hintRequest;
    }
}
