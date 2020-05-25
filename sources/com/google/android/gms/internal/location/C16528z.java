package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import com.google.android.gms.location.zzj;
import java.util.List;

/* renamed from: com.google.android.gms.internal.location.z */
public final class C16528z implements Creator<zzm> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        zzj zzj = zzm.f46438b;
        List<ClientIdentity> list = zzm.f46437a;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    zzj = (zzj) C15467a.m32145a(parcel, a, zzj.CREATOR);
                    break;
                case 2:
                    list = C15467a.m32151c(parcel, a, ClientIdentity.CREATOR);
                    break;
                case 3:
                    str = C15467a.m32163n(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        return new zzm(zzj, list, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzm[i];
    }
}
