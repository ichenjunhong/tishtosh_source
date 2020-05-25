package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.common.internal.t */
public final class C15470t implements Creator<AuthAccountRequest> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthAccountRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Integer num = null;
        Integer num2 = null;
        Account account = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    i = C15467a.m32154e(parcel, a);
                    break;
                case 2:
                    iBinder = C15467a.m32164o(parcel, a);
                    break;
                case 3:
                    scopeArr = (Scope[]) C15467a.m32150b(parcel, a, Scope.CREATOR);
                    break;
                case 4:
                    num = C15467a.m32155f(parcel, a);
                    break;
                case 5:
                    num2 = C15467a.m32155f(parcel, a);
                    break;
                case 6:
                    account = (Account) C15467a.m32145a(parcel, a, Account.CREATOR);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        AuthAccountRequest authAccountRequest = new AuthAccountRequest(i, iBinder, scopeArr, num, num2, account);
        return authAccountRequest;
    }
}
