package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.firebase.messaging.e */
public final class C17948e implements Creator<RemoteMessage> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new RemoteMessage[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            if (C15467a.m32142a(a) != 2) {
                C15467a.m32149b(parcel, a);
            } else {
                bundle = C15467a.m32165p(parcel, a);
            }
        }
        C15467a.m32173x(parcel, b);
        return new RemoteMessage(bundle);
    }
}
