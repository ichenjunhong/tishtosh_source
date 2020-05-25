package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.signin.internal.i */
public final class C17156i implements Creator<zaj> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zaj[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        ConnectionResult connectionResult = null;
        int i = 0;
        ResolveAccountResponse resolveAccountResponse = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    i = C15467a.m32154e(parcel, a);
                    break;
                case 2:
                    connectionResult = (ConnectionResult) C15467a.m32145a(parcel, a, ConnectionResult.CREATOR);
                    break;
                case 3:
                    resolveAccountResponse = (ResolveAccountResponse) C15467a.m32145a(parcel, a, ResolveAccountResponse.CREATOR);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        return new zaj(i, connectionResult, resolveAccountResponse);
    }
}
