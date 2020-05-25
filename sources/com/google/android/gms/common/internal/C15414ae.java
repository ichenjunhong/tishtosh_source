package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.common.internal.ae */
public final class C15414ae implements Creator<GetServiceRequest> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C15467a.m32148b(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        Feature[] featureArr = null;
        Feature[] featureArr2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    i = C15467a.m32154e(parcel2, a);
                    break;
                case 2:
                    i2 = C15467a.m32154e(parcel2, a);
                    break;
                case 3:
                    i3 = C15467a.m32154e(parcel2, a);
                    break;
                case 4:
                    str = C15467a.m32163n(parcel2, a);
                    break;
                case 5:
                    iBinder = C15467a.m32164o(parcel2, a);
                    break;
                case 6:
                    scopeArr = (Scope[]) C15467a.m32150b(parcel2, a, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C15467a.m32165p(parcel2, a);
                    break;
                case 8:
                    account = (Account) C15467a.m32145a(parcel2, a, Account.CREATOR);
                    break;
                case 10:
                    featureArr = (Feature[]) C15467a.m32150b(parcel2, a, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) C15467a.m32150b(parcel2, a, Feature.CREATOR);
                    break;
                case 12:
                    z = C15467a.m32152c(parcel2, a);
                    break;
                default:
                    C15467a.m32149b(parcel2, a);
                    break;
            }
        }
        C15467a.m32173x(parcel2, b);
        GetServiceRequest getServiceRequest = new GetServiceRequest(i, i2, i3, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z);
        return getServiceRequest;
    }
}
