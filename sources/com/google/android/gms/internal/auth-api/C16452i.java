package com.google.android.gms.internal.auth-api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.internal.auth-api.i */
public final class C16452i implements Creator<zzy> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzy[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            if (C15467a.m32142a(a) != 1) {
                C15467a.m32149b(parcel, a);
            } else {
                credential = (Credential) C15467a.m32145a(parcel, a, Credential.CREATOR);
            }
        }
        C15467a.m32173x(parcel, b);
        return new zzy(credential);
    }
}
