package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.auth.api.credentials.e */
public final class C15124e implements Creator<CredentialRequest> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new CredentialRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        String[] strArr = null;
        CredentialPickerConfig credentialPickerConfig = null;
        CredentialPickerConfig credentialPickerConfig2 = null;
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
                        z = C15467a.m32152c(parcel, a);
                        break;
                    case 2:
                        strArr = C15467a.m32169t(parcel, a);
                        break;
                    case 3:
                        credentialPickerConfig = (CredentialPickerConfig) C15467a.m32145a(parcel, a, CredentialPickerConfig.CREATOR);
                        break;
                    case 4:
                        credentialPickerConfig2 = (CredentialPickerConfig) C15467a.m32145a(parcel, a, CredentialPickerConfig.CREATOR);
                        break;
                    case 5:
                        z2 = C15467a.m32152c(parcel, a);
                        break;
                    case 6:
                        str = C15467a.m32163n(parcel, a);
                        break;
                    case 7:
                        str2 = C15467a.m32163n(parcel, a);
                        break;
                    case 8:
                        z3 = C15467a.m32152c(parcel, a);
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
        CredentialRequest credentialRequest = new CredentialRequest(i, z, strArr, credentialPickerConfig, credentialPickerConfig2, z2, str, str2, z3);
        return credentialRequest;
    }
}
