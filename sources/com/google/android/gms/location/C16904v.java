package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.v */
public final class C16904v implements Creator<ActivityTransitionResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            if (C15467a.m32142a(a) != 1) {
                C15467a.m32149b(parcel, a);
            } else {
                arrayList = C15467a.m32151c(parcel, a, ActivityTransitionEvent.CREATOR);
            }
        }
        C15467a.m32173x(parcel, b);
        return new ActivityTransitionResult(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransitionResult[i];
    }
}
