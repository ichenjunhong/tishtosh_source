package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* renamed from: com.google.android.gms.internal.location.r */
public final class C16520r implements Creator<zzbd> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        List<ClientIdentity> list = zzbd.f46413a;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            int a2 = C15467a.m32142a(a);
            if (a2 != 1) {
                switch (a2) {
                    case 5:
                        list = C15467a.m32151c(parcel, a, ClientIdentity.CREATOR);
                        break;
                    case 6:
                        str = C15467a.m32163n(parcel, a);
                        break;
                    case 7:
                        z = C15467a.m32152c(parcel, a);
                        break;
                    case 8:
                        z2 = C15467a.m32152c(parcel, a);
                        break;
                    case 9:
                        z3 = C15467a.m32152c(parcel, a);
                        break;
                    case 10:
                        str2 = C15467a.m32163n(parcel, a);
                        break;
                    default:
                        C15467a.m32149b(parcel, a);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) C15467a.m32145a(parcel, a, LocationRequest.CREATOR);
            }
        }
        C15467a.m32173x(parcel, b);
        zzbd zzbd = new zzbd(locationRequest, list, str, z, z2, z3, str2);
        return zzbd;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbd[i];
    }
}
