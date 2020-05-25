package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.location.u */
public final class C16903u implements Creator<ActivityTransitionRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        ArrayList arrayList = null;
        String str = null;
        List list = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    arrayList = C15467a.m32151c(parcel, a, ActivityTransition.CREATOR);
                    break;
                case 2:
                    str = C15467a.m32163n(parcel, a);
                    break;
                case 3:
                    list = C15467a.m32151c(parcel, a, ClientIdentity.CREATOR);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        return new ActivityTransitionRequest(arrayList, str, list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransitionRequest[i];
    }
}
