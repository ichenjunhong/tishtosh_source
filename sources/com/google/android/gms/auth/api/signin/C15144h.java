package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.auth.api.signin.h */
public final class C15144h implements Creator<SignInAccount> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInAccount[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        String str = "";
        String str2 = "";
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            int a2 = C15467a.m32142a(a);
            if (a2 != 4) {
                switch (a2) {
                    case 7:
                        googleSignInAccount = (GoogleSignInAccount) C15467a.m32145a(parcel, a, GoogleSignInAccount.CREATOR);
                        break;
                    case 8:
                        str2 = C15467a.m32163n(parcel, a);
                        break;
                    default:
                        C15467a.m32149b(parcel, a);
                        break;
                }
            } else {
                str = C15467a.m32163n(parcel, a);
            }
        }
        C15467a.m32173x(parcel, b);
        return new SignInAccount(str, googleSignInAccount, str2);
    }
}
