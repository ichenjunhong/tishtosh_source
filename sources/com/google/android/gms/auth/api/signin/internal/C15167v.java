package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.v */
public final class C15167v implements Creator<SignInConfiguration> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInConfiguration[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            int a2 = C15467a.m32142a(a);
            if (a2 == 2) {
                str = C15467a.m32163n(parcel, a);
            } else if (a2 != 5) {
                C15467a.m32149b(parcel, a);
            } else {
                googleSignInOptions = (GoogleSignInOptions) C15467a.m32145a(parcel, a, GoogleSignInOptions.CREATOR);
            }
        }
        C15467a.m32173x(parcel, b);
        return new SignInConfiguration(str, googleSignInOptions);
    }
}
