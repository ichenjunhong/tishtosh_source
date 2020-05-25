package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.common.internal.z */
public final class C15476z implements Creator<ResolveAccountRequest> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new ResolveAccountRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        Account account = null;
        int i = 0;
        GoogleSignInAccount googleSignInAccount = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    i = C15467a.m32154e(parcel, a);
                    break;
                case 2:
                    account = (Account) C15467a.m32145a(parcel, a, Account.CREATOR);
                    break;
                case 3:
                    i2 = C15467a.m32154e(parcel, a);
                    break;
                case 4:
                    googleSignInAccount = (GoogleSignInAccount) C15467a.m32145a(parcel, a, GoogleSignInAccount.CREATOR);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        return new ResolveAccountRequest(i, account, i2, googleSignInAccount);
    }
}
