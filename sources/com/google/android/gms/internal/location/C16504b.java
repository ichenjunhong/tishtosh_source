package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.internal.location.b */
public final class C16504b implements Creator<zzad> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        Status status = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            if (C15467a.m32142a(a) != 1) {
                C15467a.m32149b(parcel, a);
            } else {
                status = (Status) C15467a.m32145a(parcel, a, Status.CREATOR);
            }
        }
        C15467a.m32173x(parcel, b);
        return new zzad(status);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzad[i];
    }
}
