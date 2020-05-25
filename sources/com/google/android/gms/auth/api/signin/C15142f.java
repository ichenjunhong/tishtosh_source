package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.f */
public final class C15142f implements Creator<GoogleSignInOptions> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    i = C15467a.m32154e(parcel, a);
                    break;
                case 2:
                    arrayList = C15467a.m32151c(parcel, a, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) C15467a.m32145a(parcel, a, Account.CREATOR);
                    break;
                case 4:
                    z = C15467a.m32152c(parcel, a);
                    break;
                case 5:
                    z2 = C15467a.m32152c(parcel, a);
                    break;
                case 6:
                    z3 = C15467a.m32152c(parcel, a);
                    break;
                case 7:
                    str = C15467a.m32163n(parcel, a);
                    break;
                case 8:
                    str2 = C15467a.m32163n(parcel, a);
                    break;
                case 9:
                    arrayList2 = C15467a.m32151c(parcel, a, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2);
        return googleSignInOptions;
    }
}
