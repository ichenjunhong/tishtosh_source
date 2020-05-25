package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.common.internal.aa */
public final class C15410aa implements Creator<ResolveAccountResponse> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new ResolveAccountResponse[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
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
                    connectionResult = (ConnectionResult) C15467a.m32145a(parcel, a, ConnectionResult.CREATOR);
                    break;
                case 4:
                    z = C15467a.m32152c(parcel, a);
                    break;
                case 5:
                    z2 = C15467a.m32152c(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        ResolveAccountResponse resolveAccountResponse = new ResolveAccountResponse(i, iBinder, connectionResult, z, z2);
        return resolveAccountResponse;
    }
}
